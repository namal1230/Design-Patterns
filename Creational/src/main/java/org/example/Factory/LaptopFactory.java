package org.example.Factory;

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
