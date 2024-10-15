package com.example.javafeatures.java9.privatemethodsininterfaces;

interface MyInterface {
    // Default method using a private method
    default void printMessage(String message) {
        String formattedMessage = formatMessage(message);
        System.out.println(formattedMessage);
    }

    // Private method to format the message
    private String formatMessage(String message) {
        return "Formatted: " + message;
    }
}