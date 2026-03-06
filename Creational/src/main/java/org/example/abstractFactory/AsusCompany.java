package org.example.abstractFactory;

import org.example.abstractFactory.factory.Factory;
import org.example.abstractFactory.products.laptop.Laptop;
import org.example.abstractFactory.products.laptop.impl.AsusLaptop;
import org.example.abstractFactory.products.mobile.Mobile;
import org.example.abstractFactory.products.mobile.impl.AsusMobile;

public class AsusCompany extends Factory {

    @Override
    public Laptop getLaptop() {
        return new AsusLaptop();
    }

    @Override
    public Mobile getMobile() {
        return new AsusMobile();
    }
}
