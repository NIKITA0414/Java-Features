package com.example.javafeatures.java10;

import java.util.Collections;
import java.util.List;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> unmodifiableNames = Collections.unmodifiableList(names);

        // This will throw UnsupportedOperationException
        // unmodifiableNames.add("David");

        System.out.println(unmodifiableNames); // Output: [Alice, Bob, Charlie]
    }
}