package com.example.javafeatures.java9;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorExample {
    public static void main(String[] args) {
        // Using the diamond operator with an anonymous inner class
        List<String> myList = new ArrayList<>() {
            {
                add("Apple");
                add("Banana");
                add("Cherry");
            }
        };

        // Print the list
        myList.forEach(System.out::println);
    }
}
