package com.example.javafeatures.java8.functionalinterfaces;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression
        MyFunctionalInterface action = (message) -> System.out.println("Message: " + message);
        action.performAction("Hello, Functional Interfaces!");
    }
}