package com.Andrii;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        List<T> temp = new ArrayList<>(items);

        int counter = 0;
        while (result.size() != items.size()) {
            Object[] arrayOfItems = temp.toArray();
            temp.clear();

            for (Object arrayOfItem : arrayOfItems) {
                counter++;
                if (counter > arrayOfItems.length && k < arrayOfItems.length) {
                    counter = 0;
                }
                Object currentItem = arrayOfItem;

                if (counter == k) {
                    result.add((T) currentItem);
                    counter = 0;
                    continue;
                }
                temp.add((T) currentItem);
            }
        }
        return result;
    }
}

