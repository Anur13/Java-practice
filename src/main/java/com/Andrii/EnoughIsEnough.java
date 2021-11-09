package com.Andrii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for (int element : elements) {
            map.put(element, 1);
        }

        for (int element : elements) {
            if(map.get(element) <= maxOccurrences){
                list.add(element);
                map.put(element, map.get(element) + 1);
            }
        }

        Object[] array = list.toArray();
        int[] integerArray = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            integerArray[i] = (int) array[i];
        }
        return integerArray;
    }

}