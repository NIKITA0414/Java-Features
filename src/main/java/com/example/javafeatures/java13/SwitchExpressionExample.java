package com.example.javafeatures.java13;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "TUESDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> "Weekend";
            case "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(typeOfDay); // Output: Weekday
    }
}

