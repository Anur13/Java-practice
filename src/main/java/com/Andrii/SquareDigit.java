package com.Andrii;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SquareDigit {

    public int squareDigits(int n) {
        String stringOfNumbers = String.valueOf(n);

        char[] charsArray = stringOfNumbers.toCharArray();

        StringBuilder integersSquared = new StringBuilder();

        for (char c : charsArray) {
            int num = Character.getNumericValue(c);
            int squiredNum = (int) Math.pow(num, 2);
            integersSquared.append(squiredNum);
        }
        return Integer.parseInt(integersSquared.toString());
    }


}