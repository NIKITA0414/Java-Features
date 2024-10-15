package com.example.javafeatures.java12;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "   Hello, Java!   ";

        // Check if the string is blank
        System.out.println("Is blank: " + text.isBlank()); // false

        // Strip leading and trailing whitespace
        System.out.println("Stripped: '" + text.strip() + "'"); // 'Hello, Java!'

        // Split into lines
        String multilineText = "Line 1\nLine 2\nLine 3";
        multilineText.lines().forEach(System.out::println);
    }
}

