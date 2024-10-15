package com.example.javafeatures.java8.defaultandstaticmethods;

interface MyInterface {
    // Default method
    default void display() {
        System.out.println("Default display method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}
