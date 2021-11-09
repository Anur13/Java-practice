package com.Andrii;

class DuplicateEncoder {
    static String encode(String word) {
        StringBuilder builder = new StringBuilder();
        for (char c : word.toCharArray()) {
            String[] buff;

            String metaCharacters = "<([{\\^-=$!|]})?*+.>";
            if (metaCharacters.contains(String.valueOf(c))) {
                buff = word.toLowerCase().split(String.valueOf("\\" + c).toLowerCase());
            } else {
                buff = word.toLowerCase().split(String.valueOf(c).toLowerCase());
            }
            if (buff.length <= 2) {
                builder.append('(');
            } else {
                builder.append(')');
            }
        }

        return builder.toString();

    }
}

