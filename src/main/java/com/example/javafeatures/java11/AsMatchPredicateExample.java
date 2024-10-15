package com.example.javafeatures.java11;
import java.util.regex.Pattern;

class AsMatchPredicateExample {
    public static void main(String[] args) {
        var pattern = Pattern.compile("aba").asMatchPredicate();
        System.out.println(pattern.test("aabb")); // Output: false
        System.out.println(pattern.test("aba"));  // Output: true
    }
}