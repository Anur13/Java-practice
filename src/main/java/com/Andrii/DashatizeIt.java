package com.Andrii;

public class DashatizeIt {
    public static String dashatize(int num) {
        String numbers = String.valueOf(Math.abs(num));
        StringBuilder builder = new StringBuilder();
        char[] charArray = numbers.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.getNumericValue(c) % 2 != 0) {
                builder.append(String.format("-%s-", c));
            } else {
                builder.append(c);
            }
        }
        String result = builder.toString().replaceAll("--", "-");
        char[] resultsChacters = result.toCharArray();
        if (Math.abs(num) < 0) {
            result = result.substring(1);
        }
        if (resultsChacters[0] == '-' && resultsChacters[resultsChacters.length - 1] == '-') {
            return result.substring(1, resultsChacters.length - 1);
        }
        if (resultsChacters[0] == '-') {
            return result.substring(1);
        } else if (resultsChacters[resultsChacters.length - 1] == '-') {
            return result.substring(0, resultsChacters.length - 1);
        }

        return result;
    }
}
