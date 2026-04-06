package product;

import model.ConferenceType;
import model.Modality;

// PRODUCTO
// Esta es la clase final que vamos a construir paso a paso con el Builder.
public class Event {
    private String eventType;       // Deportivo o Folclórico
    private String location;        // Ubicación
    private Modality modality;      // Modalidad
    private ConferenceType conferenceType; // Conferencia / foro / panel
    private String theme;           // Tema principal
    private String baseStructure;   // Estructura base
    private boolean forum;          // Si incluye foro
    private boolean snacks;         // Si incluye snacks
    private String foodTheme;       // Tema de comida

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setModality(Modality modality) {
        this.modality = modality;
    }

    public void setConferenceType(ConferenceType conferenceType) {
        this.conferenceType = conferenceType;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setBaseStructure(String baseStructure) {
        this.baseStructure = baseStructure;
    }

    public void setForum(boolean forum) {
        this.forum = forum;
    }

    public void setSnacks(boolean snacks) {
        this.snacks = snacks;
    }

    public void setFoodTheme(String foodTheme) {
        this.foodTheme = foodTheme;
    }

    @Override
    public String toString() {
        return "==============================\n" +
               "TIPO DE EVENTO: " + eventType + "\n" +
               "UBICACION: " + location + "\n" +
               "MODALIDAD: " + modality + "\n" +
               "TIPO DE CONFERENCIA: " + conferenceType + "\n" +
               "TEMA: " + theme + "\n" +
               "ESTRUCTURA BASE: " + baseStructure + "\n" +
               "FORO: " + (forum ? "Si" : "No") + "\n" +
               "SNACKS: " + (snacks ? "Si" : "No") + "\n" +
               "TEMA DE COMIDA: " + foodTheme + "\n" +
               "==============================";
    }
}
