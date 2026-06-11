package org.example.Observer;

public class MobileAppListener implements Observer{

    private final String username;

    public MobileAppListener(String username){
        this.username=username;
    }

    @Override
    public void update(Event event) {

    }
}
