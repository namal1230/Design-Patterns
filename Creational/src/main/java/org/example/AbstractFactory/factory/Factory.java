package org.example.AbstractFactory.factory;

import org.example.AbstractFactory.products.laptop.Laptop;
import org.example.AbstractFactory.products.mobile.Mobile;

public abstract class Factory {
    public abstract Laptop getLaptop();
    public abstract Mobile getMobile();
}
