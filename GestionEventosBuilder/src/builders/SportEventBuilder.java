package builders;

import model.ConferenceType;
import model.Modality;
import product.Event;

// CONCRETE BUILDER 1
// Construye un evento deportivo.
public class SportEventBuilder implements EventBuilder {
    private Event event;

    public SportEventBuilder() {
        reset();
    }

    @Override
    public void reset() {
        event = new Event();
    }

    @Override
    public void setEventType() {
        event.setEventType("Evento Deportivo");
    }

    @Override
    public void setLocation(String location) {
        event.setLocation(location);
    }

    @Override
    public void setModality(Modality modality) {
        event.setModality(modality);
    }

    @Override
    public void setConferenceType(ConferenceType conferenceType) {
        event.setConferenceType(conferenceType);
    }

    @Override
    public void setTheme(String theme) {
        event.setTheme(theme);
    }

    @Override
    public void setBaseStructure(String baseStructure) {
        event.setBaseStructure(baseStructure);
    }

    @Override
    public void setForum(boolean forum) {
        event.setForum(forum);
    }

    @Override
    public void setSnacks(boolean snacks) {
        event.setSnacks(snacks);
    }

    @Override
    public void setFoodTheme(String foodTheme) {
        event.setFoodTheme(foodTheme);
    }

    // Método para devolver el producto final.
    public Event getResult() {
        return event;
    }
}
