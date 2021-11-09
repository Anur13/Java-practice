package com.Andrii;

public class ToCamelCase {
    static String toCamelCase(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-') {
                builder.append(String.valueOf(s.charAt(i + 1)).toUpperCase());
                i += 1;
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
