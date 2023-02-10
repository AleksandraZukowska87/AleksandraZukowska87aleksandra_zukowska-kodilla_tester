package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {

//    public static void main(String[] args) {
//        Client client = new Client("mark");
//        Client client2 = new Client("jeff");
//        Notification notification = new Notification("Thunderstorms soon");
//        Location location = new Location("London");
//        Location location2 = new Location("Warsaw");
//        NotificationService notificationService = new NotificationService();
//
//        notificationService.subscribe(client, location);
//        notificationService.subscribe(client2, location2);
//
//        notificationService.deleteLocation(location);
//        notificationService.sendLocationNotification(notification,location);
//
//        notificationService.unsubscribeFromLocation(client,location);
//        notificationService.unsubscribeFromAllLocations(client);
//
//        notificationService.sendLocationNotification(notification,location);
//        notificationService.sendNotificationToAll(notification);
//
//
//    }

    public Set<Client> clients = new HashSet<>();


    public void sendNotificationToAll(Notification notification){
        for (Client client : clients){
            client.receiveGlobalNotification(notification);
        }
    }
    public void sendLocationNotification(Notification notification, Location location){

        for (Client client : clients){
            client.receiveNotification(notification, location);
        }
    }

    public void subscribe(Client client, Location location){
        this.clients.add(client);
        client.getSubscribedLocations().add(location);

    }
    public void unsubscribeFromLocation(Client client, Location _location){
        for (Location location : client.subscribedLocations){
            if (client.subscribedLocations.contains(_location))
                    client.subscribedLocations.remove(_location);
        }
    }
    public void unsubscribeFromAllLocations(Client client){
        this.clients.remove(client);
    }
    public void deleteLocation(Location location){
        this.clients.forEach(client -> {
            client.subscribedLocations.remove(location);
        });
    }

    public Set<Client> getClients(){
        return this.clients;
    }


}
