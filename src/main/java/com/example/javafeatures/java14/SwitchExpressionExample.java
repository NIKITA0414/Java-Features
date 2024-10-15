package com.example.javafeatures.java14;
public class SwitchExpressionExample {
    public static void main(String[] args) {
        int dayOfWeek = 5; // Friday
        String dayType = switch (dayOfWeek) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
        };
        System.out.println(dayType); // Output: Weekday
    }
}