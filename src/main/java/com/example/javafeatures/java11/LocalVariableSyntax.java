package com.example.javafeatures.java11;

import java.util.Arrays;
import java.util.List;

public class LocalVariableSyntax {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach((var name) -> System.out.println(name));
    }
}