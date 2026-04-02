package clases;

import interfaces.Notification;

public class ConcertNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Enviando notificación de simposio...");
    }
}
