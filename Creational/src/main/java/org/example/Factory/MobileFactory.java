package org.example.Factory;

import org.example.Factory.enums.MobileType;
import org.example.Factory.products.mobile.impl.AppleMobile;
import org.example.Factory.products.mobile.Mobile;
import org.example.Factory.products.mobile.impl.NokiaMobile;

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
