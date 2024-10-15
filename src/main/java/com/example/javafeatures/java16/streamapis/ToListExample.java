package com.example.javafeatures.java16.streamapis;

import java.util.stream.Stream;

public class ToListExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        // Collecting to an unmodifiable List
        var list = stream.toList();

        System.out.println(list); // Output: [apple, banana, cherry]

        // Attempting to modify the list will throw UnsupportedOperationException
        // list.add("date"); // Uncommenting this line will throw an exception
    }
}