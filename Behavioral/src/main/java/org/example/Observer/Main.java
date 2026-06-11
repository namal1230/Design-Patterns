package org.example.Observer;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Observer mobile1 = new MobileAppListener("Kamal");
        Observer email1 = new EmailMsgListener("Kamal@gmail.com");

        service.subscribe(Event.NEW_ITEM,mobile1);
        service.subscribe(Event.NEW_ITEM,email1);

        service.notifyObservers(Event.NEW_ITEM);

    }
}
