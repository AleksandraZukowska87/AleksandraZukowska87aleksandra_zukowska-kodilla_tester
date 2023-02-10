package mockito.homework;

import com.kodilla.mockito.homework.Client;
import com.kodilla.mockito.homework.Location;
import com.kodilla.mockito.homework.NotificationService;
import com.kodilla.mockito.homework.Notification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.utilities.Assert;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.times;

public class NotificationServiceTestSuite {

    Set<Client> clients = new HashSet<>();



    Client client = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);

    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    Location location3 = Mockito.mock(Location.class);

    Notification notification = Mockito.mock(Notification.class);

    NotificationService notificationService = new NotificationService();





    @Test
    public void shouldSendNotificationToEveryone(){

        notificationService.subscribe(client,location);
        notificationService.subscribe(client2,location);
        notificationService.subscribe(client3,location);



        notificationService.sendNotificationToAll(notification);


        Mockito.verify(client,times(1)).receiveGlobalNotification(notification);
        Mockito.verify(client2,times(1)).receiveGlobalNotification(notification);
        Mockito.verify(client3,times(1)).receiveGlobalNotification(notification);

    }

    @Test
    public void shouldSendNotificationToLocationSubscribers(){
        notificationService.subscribe(client,location);


        notificationService.sendLocationNotification(notification,location);
        Mockito.verify(client,times(1)).receiveNotification(notification, location);
    }

    @Test
    public void shouldAddSubscriberOncePerLocation(){
        Assertions.assertEquals(0,notificationService.clients.size());
        notificationService.subscribe(client,location);
        notificationService.subscribe(client,location);
        notificationService.subscribe(client,location);
        Assertions.assertEquals(1, notificationService.clients.size());
    }

    @Test
    public void shouldRemoveSubscriptionForLocation(){

        Assertions.assertEquals(0, notificationService.clients.size());
        notificationService.subscribe(client, location);
        Assertions.assertEquals(1, notificationService.clients.size());

    }
    @Test
    public void shouldRemoveAllSubscriptions() {
        notificationService.subscribe(client, location);
        notificationService.subscribe(client, location2);
        notificationService.subscribe(client, location3);

        Mockito.when(notificationService.getClients()).thenReturn(clients);

        notificationService.unsubscribeFromAllLocations(client);

        Assertions.assertEquals(0, client.getSubscribedLocations().size());
        Assertions.assertFalse(notificationService.getClients().contains(client));
    }

    @Test
    public void shouldRemoveAllLocations(){
        clients.add(client);
        clients.add(client);
        clients.add(client);
        this.clients.forEach(client -> {
            notificationService.subscribe(client,location);
            client.getSubscribedLocations().remove(location);
            Assertions.assertTrue(client.getSubscribedLocations().size() == 0);
        });
    }

}
