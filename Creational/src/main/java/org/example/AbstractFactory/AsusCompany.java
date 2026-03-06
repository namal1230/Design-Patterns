package org.example.AbstractFactory;

import org.example.AbstractFactory.factory.Factory;
import org.example.AbstractFactory.products.laptop.Laptop;
import org.example.AbstractFactory.products.laptop.impl.AsusLaptop;
import org.example.AbstractFactory.products.mobile.Mobile;
import org.example.AbstractFactory.products.mobile.impl.AsusMobile;

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
