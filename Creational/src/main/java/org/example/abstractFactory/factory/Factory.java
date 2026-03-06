package org.example.abstractFactory.factory;

import org.example.abstractFactory.products.laptop.Laptop;
import org.example.abstractFactory.products.mobile.Mobile;

public abstract class Factory {
    public abstract Laptop getLaptop();
    public abstract Mobile getMobile();
}
