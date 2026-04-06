package director;

import builders.EventBuilder;
import model.ConferenceType;
import model.Modality;

// DIRECTOR
// Aquí se define el ORDEN en que se construye el objeto.
// Esto representa exactamente la parte del diagrama donde el Director
// llama a los métodos del Builder en una secuencia específica.
public class EventDirector {

    // Construcción de un evento deportivo
    public void buildSportEvent(EventBuilder builder) {
        builder.reset();
        builder.setEventType();
        builder.setLocation("Estadio Olímpico Atahualpa");
        builder.setModality(Modality.PRESENCIAL);
        builder.setConferenceType(ConferenceType.PANEL);
        builder.setTheme("Competencia y liderazgo deportivo");
        builder.setBaseStructure("Apertura, competencia principal, premiación y cierre");
        builder.setForum(true);
        builder.setSnacks(true);
        builder.setFoodTheme("Comida energética y bebidas hidratantes");
    }

    // Construcción de un evento folclórico
    public void buildFolkloricEvent(EventBuilder builder) {
        builder.reset();
        builder.setEventType();
        builder.setLocation("Casa de la Cultura");
        builder.setModality(Modality.HIBRIDA);
        builder.setConferenceType(ConferenceType.FORO);
        builder.setTheme("Tradiciones y expresiones del folclore ecuatoriano");
        builder.setBaseStructure("Bienvenida, presentaciones artísticas, foro cultural y clausura");
        builder.setForum(true);
        builder.setSnacks(true);
        builder.setFoodTheme("Comida típica: empanadas, humitas y canelazo");
    }

    // Puedes hacer otra configuración variando datos
    // para mostrar que el director reutiliza la misma estructura.
    public void buildCustomFolkloricEvent(EventBuilder builder) {
        builder.reset();
        builder.setEventType();
        builder.setLocation("Teatro Nacional");
        builder.setModality(Modality.PRESENCIAL);
        builder.setConferenceType(ConferenceType.CHARLA);
        builder.setTheme("Danzas, música andina y memoria cultural");
        builder.setBaseStructure("Recepción, charla principal, danza en vivo, foro abierto");
        builder.setForum(true);
        builder.setSnacks(false);
        builder.setFoodTheme("Platos tradicionales serranos");
    }
}