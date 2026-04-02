package fabricas;

import interfaces.Event;
import interfaces.Notification;

public interface EventCuratorFactory {
    Event createEvent();
    Notification createNotification();
}
