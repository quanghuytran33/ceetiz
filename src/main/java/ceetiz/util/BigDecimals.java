package ceetiz.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimals {

    private BigDecimals(){
        throw new UnsupportedOperationException("Helper Class shouldn't be instantiated");
    }

    public static BigDecimal roundUp(BigDecimal number){
        return number.setScale(2, RoundingMode.CEILING);
    }
}
