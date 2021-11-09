package com.Andrii;

public class Dubstep {
    public static String SongDecoder(String song) {
        String[] splitSong = song.split("WUB");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < splitSong.length; i++) {
            if (!splitSong[i].equals("")) {
                stringBuilder.append(splitSong[i]);
                if (i != splitSong.length - 1) {
                    stringBuilder.append(" ");
                }
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}