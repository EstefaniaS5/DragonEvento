package builders;

import model.ConferenceType;
import model.Modality;

// BUILDER (interfaz)
// Aquí declaramos los pasos comunes de construcción.
public interface EventBuilder {
    void reset();
    void setEventType();
    void setLocation(String location);
    void setModality(Modality modality);
    void setConferenceType(ConferenceType conferenceType);
    void setTheme(String theme);
    void setBaseStructure(String baseStructure);
    void setForum(boolean forum);
    void setSnacks(boolean snacks);
    void setFoodTheme(String foodTheme);
}
