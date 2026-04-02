package fabricas;

import clases.ConcertEvent;
import clases.ConcertNotification;
import interfaces.Event;
import interfaces.Notification;

public class ConcertFactory implements EventCuratorFactory {

    @Override
    public Event createEvent() {
        return new ConcertEvent();
    }

    @Override
    public Notification createNotification() {
        return new ConcertNotification();
    }
}