package com.Andrii;

import java.util.HashMap;
import java.util.Map;

public class FindDifferentNumber {
    static int stray(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}


