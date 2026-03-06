package org.example.factory;

import org.example.factory.enums.MobileType;
import org.example.factory.products.mobile.impl.AppleMobile;
import org.example.factory.products.mobile.Mobile;
import org.example.factory.products.mobile.impl.NokiaMobile;

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
