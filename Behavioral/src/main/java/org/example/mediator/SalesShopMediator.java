package org.example.mediator;

public class SalesShopMediator implements Mediator{

    private CustomerSave customerSave;
    private SalesShop salesShop;

    public  void setSalesShop(SalesShop salesShop){
        this.salesShop=salesShop;
    }

    public void setCustomerSave(CustomerSave customerSave){
        this.customerSave=customerSave;
    }

    @Override
    public void customerVisit(String date,String status) {
        salesShop.notifyShop(status);
        customerSave.customerSave(status,date);
    }
}
