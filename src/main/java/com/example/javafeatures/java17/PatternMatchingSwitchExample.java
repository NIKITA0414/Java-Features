package com.example.javafeatures.java17;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj1 = "Hello, World!";
        Object obj2 = 42;
        Object obj3 = 3.14;

        System.out.println(describe(obj1)); // String
        System.out.println(describe(obj2)); // Integer
        System.out.println(describe(obj3)); // Unknown Type
    }

    static String describe(Object obj) {
        return switch (obj) {
            case String s -> "String: " + s;       // Matches String and binds it to 's'
            case Integer i -> "Integer: " + i;     // Matches Integer and binds it to 'i'
            case Double d -> "Double: " + d;       // Matches Double and binds it to 'd'
            case null -> "Null value";              // Matches null
            default -> "Unknown Type";              // Fallback case
        };
    }
}
