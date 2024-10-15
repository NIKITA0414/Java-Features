package com.example.javafeatures.java8;

public class MathUtilityExample {
    public static void main(String[] args) {
        double num1 = -25.0;
        double num2 = 16.0;
        double num3 = 4.0;
        double num4 = 2.0;

        // Using Math utility methods
        double absoluteValue = Math.abs(num1);
        double maximum = Math.max(num2, num3);
        double minimum = Math.min(num2, num3);
        double squareRoot = Math.sqrt(num2);
        double power = Math.pow(num4, 3); // 2^3

        // Print the results
        System.out.println("Absolute value of " + num1 + ": " + absoluteValue);
        System.out.println("Maximum of " + num2 + " and " + num3 + ": " + maximum);
        System.out.println("Minimum of " + num2 + " and " + num3 + ": " + minimum);
        System.out.println("Square root of " + num2 + ": " + squareRoot);
        System.out.println(num4 + " raised to the power of 3: " + power);
    }
}