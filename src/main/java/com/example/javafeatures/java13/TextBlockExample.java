package com.example.javafeatures.java13;

public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
                {
                    "name": "Alice",
                    "age": 30,
                    "city": "Wonderland"
                }
                """;

        System.out.println(json);
    }
}