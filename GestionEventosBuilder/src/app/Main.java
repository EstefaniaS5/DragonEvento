package app;

import builders.FolkloricEventBuilder;
import builders.SportEventBuilder;
import director.EventDirector;
import product.Event;

// CLIENT
// Aquí se ve cómo el cliente usa Director + Builder.
// Esta parte corresponde a la parte superior del diagrama:
// el cliente crea el director, crea el builder, llama al director
// y luego obtiene el resultado desde el builder.
public class Main {
    public static void main(String[] args) {

        // Se crea el director
        EventDirector director = new EventDirector();

        // ===== EVENTO DEPORTIVO =====
        SportEventBuilder sportBuilder = new SportEventBuilder();

        // El Director usa el Builder para construir el evento paso a paso
        director.buildSportEvent(sportBuilder);

        // El producto final se obtiene desde el builder
        Event sportEvent = sportBuilder.getResult();

        System.out.println("EVENTO 1");
        System.out.println(sportEvent);

        // ===== EVENTO FOLCLÓRICO =====
        FolkloricEventBuilder folkloricBuilder = new FolkloricEventBuilder();

        // De nuevo, el Director reutiliza la misma idea de construcción
        director.buildFolkloricEvent(folkloricBuilder);

        Event folkloricEvent = folkloricBuilder.getResult();

        System.out.println("EVENTO 2");
        System.out.println(folkloricEvent);

        // ===== OTRA VARIACIÓN FOLCLÓRICA =====
        FolkloricEventBuilder customFolkloricBuilder = new FolkloricEventBuilder();
        director.buildCustomFolkloricEvent(customFolkloricBuilder);

        Event customEvent = customFolkloricBuilder.getResult();

        System.out.println("EVENTO 3");
        System.out.println(customEvent);
    }
}