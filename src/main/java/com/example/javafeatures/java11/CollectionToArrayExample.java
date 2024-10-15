package com.example.javafeatures.java11;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArrayExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Method 1: Using toArray() (returns Object[])
        Object[] objectArray = stringList.toArray();
        System.out.println("Object Array:");
        for (Object obj : objectArray) {
            System.out.println(obj);
        }

        // Method 2: Using toArray(T[] a)
        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("\nString Array:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}


