package org.example.Observer;

import java.util.*;

public class NotificationService {
    private final Map<Event, List<Observer>> customer;

    public NotificationService() {
        customer = new HashMap<>();
        Arrays.stream(Event.values()).forEach(
                event -> customer.put(event, new ArrayList<>()));

    }

    public void subscribe(Event eventType,Observer listener){
        customer.get(eventType).add(listener);
    }

    public void unsubscribe(Event eventType,Observer listener){
        customer.get(eventType).remove(listener);
    }

    public void notifyObservers(Event eventType){
        customer.get(eventType).forEach(listener->listener.update(eventType));
    }
}
