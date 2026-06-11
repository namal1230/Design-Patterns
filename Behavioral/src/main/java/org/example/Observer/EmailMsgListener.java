package org.example.Observer;

public class EmailMsgListener implements Observer {
    private final String email;

    public EmailMsgListener(String email){
        this.email=email;
    }

    @Override
    public void update(Event event) {
        System.out.println("Email sent to " + email +
                " -> Event: " + event);
    }
}
