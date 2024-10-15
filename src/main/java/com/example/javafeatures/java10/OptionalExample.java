package com.example.javafeatures.java10;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        var optionalValue = Optional.ofNullable(getValue());

        // Using orElseThrow() to provide a custom exception
        String value = optionalValue.orElseThrow(() -> new IllegalArgumentException("Value not found"));

        System.out.println(value);
    }

    private static String getValue() {
        // Simulating a scenario where the value is not found
        return null;
    }
}