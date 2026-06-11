package org.example.Observer;

import java.util.EventListener;

public class EmailMsgListener implements Observer {
    private final String email;

    public EmailMsgListener(String email){
        this.email=email;
    }

    @Override
    public void update(Event event) {

    }
}
