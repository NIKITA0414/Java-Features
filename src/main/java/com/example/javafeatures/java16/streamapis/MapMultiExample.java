package com.example.javafeatures.java16.streamapis;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMultiExample {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world");

        // Using mapMulti to split words into characters
        var characters = words.stream()
                .mapMulti((word, consumer) -> {
                    for (char c : word.toCharArray()) {
                        consumer.accept(c); // Push each character to the consumer
                    }
                })
                .toList(); // Collecting the results to an unmodifiable List

        System.out.println(characters); // Output: [h, e, l, l, o, w, o, r, l, d]
    }
}
