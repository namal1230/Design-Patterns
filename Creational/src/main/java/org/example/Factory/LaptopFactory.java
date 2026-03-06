package org.example.Factory;

import org.example.Factory.enums.LaptopType;
import org.example.Factory.products.laptop.impl.AsusLaptop;
import org.example.Factory.products.laptop.impl.HpLaptop;
import org.example.Factory.products.laptop.Laptop;

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
