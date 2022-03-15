package com.Andrii;

import java.util.Arrays;

public class LengthOfMissingArray {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {

        if (arrayOfArrays == null || arrayOfArrays.length == 0) {
            return 0;
        }

        for (Object[] array : arrayOfArrays) {
            if (array == null || array.length == 0) return 0;
        }

        java.util.Arrays.sort(arrayOfArrays, new java.util.Comparator<>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                return Integer.compare(o1.length, o2.length);
            }
        });
        int result = 0;
        int counter = arrayOfArrays[0].length;

        if (arrayOfArrays[0].length == 0) {
            return 0;
        }
        for (Object[] arrayOfArray : arrayOfArrays) {
            if (arrayOfArray.length != counter) {
                result = counter;
                break;
            }
            counter++;
        }

        return result;
    }

}
