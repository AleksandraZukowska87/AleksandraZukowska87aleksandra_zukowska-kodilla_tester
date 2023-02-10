package com.kodilla.mockito.homework;

import java.util.HashSet;
import java.util.Set;

public class Client {
    String clientName;
    Set<Location> subscribedLocations = new HashSet<>();

    public Client(String clientName){
        this.clientName = clientName;
    }

    public void receiveNotification(Notification notification, Location location){
        if (getSubscribedLocations().contains(location)){
        System.out.println(clientName + " Received a notification for "+location.getName()+": "+ notification.getContent());
        }
    }
    public void receiveGlobalNotification(Notification notification){
        System.out.println(clientName + " Received a GLOBAL notification: "+ notification.getContent());
    }

    public Set<Location> getSubscribedLocations() {
        return subscribedLocations;
    }
}
