package org.example.AbstractFactory;

import org.example.AbstractFactory.factory.Factory;
import org.example.AbstractFactory.products.laptop.Laptop;
import org.example.AbstractFactory.products.laptop.impl.AppleLaptop;
import org.example.AbstractFactory.products.mobile.Mobile;
import org.example.AbstractFactory.products.mobile.impl.AppleMobile;

public class AppleCompany extends Factory {

    @Override
    public Laptop getLaptop() {
        return new AppleLaptop();
    }

    @Override
    public Mobile getMobile() {
        return new AppleMobile();
    }
}
