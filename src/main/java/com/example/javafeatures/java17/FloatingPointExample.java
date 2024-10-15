package com.example.javafeatures.java17;

public class FloatingPointExample {
    public static void main(String[] args) {
        // Example of floating-point operations
        double a = 1.0;
        double b = 0.1;

        // Using strict semantics
        double sum = a + b; // Expected: 1.1
        double product = a * b; // Expected: 0.1

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // Comparing floating-point numbers
        double epsilon = 1e-10; // Tolerance for comparison
        boolean areEqual = Math.abs((a + b) - 1.1) < epsilon;

        System.out.println("Are sum and expected value equal? " + areEqual);
    }
}