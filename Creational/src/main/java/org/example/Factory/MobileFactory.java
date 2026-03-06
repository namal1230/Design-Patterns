package org.example.Factory;

public class MobileFactory {
    public static Mobile getMobile(MobileType mobile) {
        if (mobile == MobileType.NOKIA){
            return new NokiaMobile();
        }

        if (mobile == MobileType.APPLE) {
            return new AppleMobile();
        }

        throw new IllegalArgumentException("Item not Available");

    }
}
