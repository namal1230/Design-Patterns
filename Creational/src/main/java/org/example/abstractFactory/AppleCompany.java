package org.example.abstractFactory;

import org.example.abstractFactory.factory.Factory;
import org.example.abstractFactory.products.laptop.Laptop;
import org.example.abstractFactory.products.laptop.impl.AppleLaptop;
import org.example.abstractFactory.products.mobile.Mobile;
import org.example.abstractFactory.products.mobile.impl.AppleMobile;

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
