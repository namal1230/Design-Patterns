package org.example.mediator;

public class Main {
    public static void main(String[] args) {


        SalesShopMediator salesShopMediator = new SalesShopMediator();

        SalesShop salesShop = new SalesShop();
        CustomerSave customerSave = new CustomerSave();

        salesShopMediator.setCustomerSave(customerSave);
        salesShopMediator.setSalesShop(salesShop);

        Customer customer = new CustomerImpl(salesShopMediator,"Nimal");

        customer.customerStatus("Visited","2026-03-07");

    }
}
