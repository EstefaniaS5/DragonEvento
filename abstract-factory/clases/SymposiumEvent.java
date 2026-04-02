package clases;

import interfaces.Event;

public class SymposiumEvent implements Event {

    @Override
    public void create() {
        System.out.println("Creando evento de simposio...");
    }

    @Override
    public String getDetails() {
        return "Evento de simposio: Cumbre de Ética Cuántica";
    }
}