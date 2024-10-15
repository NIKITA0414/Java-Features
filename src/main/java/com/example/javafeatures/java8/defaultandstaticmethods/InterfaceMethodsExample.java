package com.example.javafeatures.java8.defaultandstaticmethods;


public class InterfaceMethodsExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // Calls overridden method

        // Calling the static method
        MyInterface.staticMethod();
    }
}