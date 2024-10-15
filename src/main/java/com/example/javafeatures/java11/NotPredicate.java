package com.example.javafeatures.java11;

import java.util.function.Predicate;

public class NotPredicate {
    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = Predicate.not(isEmpty);

        System.out.println(isNotEmpty.test("Hello")); // true
        System.out.println(isNotEmpty.test(""));      // false
    }
}