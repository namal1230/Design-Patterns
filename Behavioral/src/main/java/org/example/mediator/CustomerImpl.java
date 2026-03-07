package org.example.mediator;

public class CustomerImpl extends Customer{

    public CustomerImpl(Mediator mediator, String userName) {
        super(mediator, userName);
    }

    @Override
    public void customerStatus(String status,String date) {
        System.out.println("Customer status: "+status+" at "+date);
        mediator.customerVisit(date,status);
    }

}
