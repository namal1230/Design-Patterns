package org.example.templateMethod;

public abstract class Computer {

    public final void computerProcess(){
        pressOnSwitch();
        loadOS();
        pressOfSwitch();
    }

    public void pressOnSwitch(){
        System.out.println("Device is starting");
    }

    protected abstract void loadOS();

    public void pressOfSwitch(){
        System.out.println("Device is shutdown");
    }
}
