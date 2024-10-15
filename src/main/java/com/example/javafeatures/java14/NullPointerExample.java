package com.example.javafeatures.java14;

public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
        // The following line will throw a NullPointerException with helpful context.
        System.out.println(str.length());
    }
}
