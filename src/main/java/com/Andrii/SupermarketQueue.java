package com.Andrii;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SupermarketQueue {
    public static <K, V> int solveSuperMarketQueue(int[] customers, int tills) {
        if (tills == 1) {
            return Arrays.stream(customers).sum();
        }
        Map<Integer, Integer> tillsData = new HashMap<>();

        for (int i = 1; i <= tills; i++) {
            tillsData.put(i, 0);
        }

        for (int customerHour : customers) {
            int minValue = Collections.min(tillsData.values());
            for (Map.Entry<Integer, Integer> entry : tillsData.entrySet()) {
                if (entry.getValue().equals(minValue)) {
                    tillsData.put(entry.getKey(), customerHour + minValue);
                    break;
                }
            }
        }


        return Collections.max(tillsData.values());
    }
}
