package com.example.javafeatures.java15;

public class CharSequenceIsEmptyExample {
    public static void main(String[] args) {
        CharSequence emptySequence = "";
        CharSequence nonEmptySequence = "Java 15";

        // Check if the CharSequences are empty
        boolean isEmpty1 = emptySequence.isEmpty();
        boolean isEmpty2 = nonEmptySequence.isEmpty();

        System.out.println("Is emptySequence empty? " + isEmpty1);
        System.out.println("Is nonEmptySequence empty? " + isEmpty2);
    }
}