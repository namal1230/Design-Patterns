package org.example.factory;

import org.example.factory.enums.LaptopType;
import org.example.factory.products.laptop.impl.AsusLaptop;
import org.example.factory.products.laptop.impl.HpLaptop;
import org.example.factory.products.laptop.Laptop;

public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptop) {
        if (laptop == LaptopType.HP){
            return new HpLaptop();
        }
        if (laptop == LaptopType.ASUS) {
            return new AsusLaptop();
        }

        throw new IllegalArgumentException("Item not Available");

    }
}
