package com.example.javafeatures.java10;

import java.util.List;
import java.util.stream.Collectors;

public class LocalVariableInferenceExample {
    public static void main(String[] args) {
        var names = List.of("Alice", "Bob", "Charlie");

        var filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(filteredNames); // Output: [Alice]
    }
}
