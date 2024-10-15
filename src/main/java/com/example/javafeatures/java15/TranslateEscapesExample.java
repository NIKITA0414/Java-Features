package com.example.javafeatures.java15;

public class TranslateEscapesExample {
    public static void main(String[] args) {
        String escapedString = "Hello,\\nWorld!\\tJava 15";

        // Translate escape sequences into corresponding characters
        String translatedString = escapedString.translateEscapes();

        System.out.println("Escaped String: " + escapedString);
        System.out.println("Translated String: " + translatedString);
    }
}