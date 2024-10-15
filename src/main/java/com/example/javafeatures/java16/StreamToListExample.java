package com.example.javafeatures.java16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToListExample {
    public static void main(String[] args) {
        List<String> integersAsString = Arrays.asList("1", "2", "3");

        List<Integer> ints = integersAsString.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> intsEquivalent = integersAsString.stream()
                .map(Integer::parseInt)
                .toList();

        System.out.println("Using Collectors.toList(): " + ints);
        System.out.println("Using Stream.toList(): " + intsEquivalent);
    }
}
