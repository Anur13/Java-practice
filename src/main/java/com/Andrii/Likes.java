package com.Andrii;


public class Likes {
//    public static String whoLikesIt(String... names) {
//        StringBuilder builder = new StringBuilder();
//        if (names.length == 0) {
//            builder.append("no one likes this");
//        } else if (names.length >= 4) {
//            builder.append(names[0]);
//            builder.append(", ");
//            builder.append(names[1]).append(' ').append("and ");
//            builder.append(names.length - 2).append(' ');
//            builder.append("others like this");
//        } else {
//            for (int i = 0; i < names.length; i++) {
//                builder.append(names[i]);
//                if (i < names.length - 2) {
//                    builder.append(", ");
//                } else if (i != names.length - 1) {
//                    builder.append(' ');
//                    builder.append("and ");
//                }
//            }
//            if (names.length == 1) {
//                builder.append(" likes this");
//            } else {
//                builder.append(" like this");
//            }
//
//        }
//        return builder.toString();
//    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}

