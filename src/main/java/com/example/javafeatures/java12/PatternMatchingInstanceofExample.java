package com.example.javafeatures.java12;

public class PatternMatchingInstanceofExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        // Use pattern matching to simplify instanceof checks
        if (obj instanceof String str) {
            System.out.println("String length: " + str.length()); // Output: String length: 13
        } else {
            System.out.println("Not a string");
        }
    }
}