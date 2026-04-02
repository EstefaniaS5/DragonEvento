package principal;

import fabricas.ConcertFactory;
import fabricas.EventCuratorFactory;
import fabricas.SymposiumFactory;
import interfaces.Event;
import interfaces.Notification;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ORGANIZADOR DEL EVENTO ===");

        System.out.println("\n--- FÁBRICA DE CONCIERTOS ---");
        executeFactory(new ConcertFactory());

        System.out.println("\n--- FÁBRICA DE SIMPOSIOS ---");
        executeFactory(new SymposiumFactory());
    }

    public static void executeFactory(EventCuratorFactory factory) {
        Event event = factory.createEvent();
        Notification notification = factory.createNotification();

        event.create();
        notification.send();
        System.out.println(event.getDetails());
    }
}