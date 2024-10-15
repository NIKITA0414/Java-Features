package com.example.javafeatures.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Using forEach to print each fruit
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
