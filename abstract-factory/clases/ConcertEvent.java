package clases;

import interfaces.Event;

public class ConcertEvent implements Event {

    @Override
    public void create() {
        System.out.println("Creando evento de concierto...");
    }

    @Override
    public String getDetails() {
        return "Evento de concierto: Neon Echoes - The Midnight Tour";
    }
}