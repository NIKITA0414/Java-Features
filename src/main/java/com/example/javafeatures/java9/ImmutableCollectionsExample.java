package com.example.javafeatures.java9;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        // Creating an immutable List
        List<String> immutableList = List.of("Apple", "Banana", "Cherry");
        System.out.println("Immutable List: " + immutableList);

        // Creating an immutable Set
        Set<String> immutableSet = Set.of("Red", "Green", "Blue");
        System.out.println("Immutable Set: " + immutableSet);

        // Creating an immutable Map
        Map<String, Integer> immutableMap = Map.of("One", 1, "Two", 2, "Three", 3);
        System.out.println("Immutable Map: " + immutableMap);

        // Creating an immutable Map.Entry
        Map.Entry<String, Integer> entry = Map.entry("Four", 4);
        System.out.println("Map Entry: " + entry);
    }
}
