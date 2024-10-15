package com.example.javafeatures.java16.streamapis;

import java.util.List;
import java.util.stream.IntStream;

public class MapMultiToIntExample {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4", "5");

        // Using mapMultiToInt to parse strings to integers
        IntStream intStream = numbers.stream()
                .mapMultiToInt((number, consumer) -> {
                    try {
                        consumer.accept(Integer.parseInt(number)); // Convert to int
                    } catch (NumberFormatException e) {
                        // Handle parsing error (ignore in this case)
                    }
                });

        intStream.forEach(System.out::println); // Output: 1 2 3 4 5
    }
}