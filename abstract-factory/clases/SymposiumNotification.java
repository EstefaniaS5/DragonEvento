package clases;

import interfaces.Notification;

public class SymposiumNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending symposium notification...");
    }
}