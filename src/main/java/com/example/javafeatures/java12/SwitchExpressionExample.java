package com.example.javafeatures.java12;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> "Weekend";
            case "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(typeOfDay); // Output: Weekend
    }
}
