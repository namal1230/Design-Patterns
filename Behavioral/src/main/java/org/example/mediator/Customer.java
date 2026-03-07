package org.example.mediator;

public abstract class Customer {
    protected Mediator mediator;
    protected String userName;

    public Customer(Mediator mediator, String userName){
        this.mediator=mediator;
        this.userName=userName;
    }

    public abstract void customerStatus(String status,String date);
}
