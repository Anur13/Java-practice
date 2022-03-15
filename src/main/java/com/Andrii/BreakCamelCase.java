package com.Andrii;

import java.util.Arrays;

public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
