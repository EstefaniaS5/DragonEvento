package fabricas;

import clases.SymposiumEvent;
import clases.SymposiumNotification;
import interfaces.Event;
import interfaces.Notification;

public class SymposiumFactory implements EventCuratorFactory {

    @Override
    public Event createEvent() {
        return new SymposiumEvent();
    }

    @Override
    public Notification createNotification() {
        return new SymposiumNotification();
    }
}
