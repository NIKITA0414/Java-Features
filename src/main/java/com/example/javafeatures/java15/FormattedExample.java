package com.example.javafeatures.java15;

public class FormattedExample {
    public static void main(String[] args) {
        String template = "Hello, %s! Welcome to Java %d.";

        // Format the string using the formatted() method
        String formattedString = template.formatted("Ananya", 15);

        System.out.println(formattedString);
    }
}