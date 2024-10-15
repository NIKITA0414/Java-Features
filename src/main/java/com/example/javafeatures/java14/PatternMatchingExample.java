package com.example.javafeatures.java14;
public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase()); // Output: HELLO, WORLD!
        }
    }
}