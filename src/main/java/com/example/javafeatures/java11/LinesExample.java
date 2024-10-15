package com.example.javafeatures.java11;

import java.util.stream.Collectors;

class LinesExample {
    public static void main(String[] args) {
        String str = "Geeks\nFor\nGeeks";
        System.out.println(str.lines().collect(Collectors.toList()));
        // Output: [Geeks, For, Geeks]
    }
}