package com.Andrii;

import java.math.BigInteger;

class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        int n1 = 0;
        int n2 = 1;

        int sum = 0;

        int perimeter = 1;


        for (int i = 1; i < n.intValue() ; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            perimeter += n2;
        }
        return  BigInteger.valueOf(perimeter * 4)  ;

    }
}
