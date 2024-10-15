package com.example.javafeatures.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupportExample {
    public static void main(String[] args) {
        // Create a LocalTime instance
        LocalTime time = LocalTime.parse("15:25:08.690791");

        // Define the DateTimeFormatter with the period-of-day symbol "B"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");

        // Format the LocalTime instance
        String formattedTime = time.format(formatter);

        // Output the result
        System.out.println(formattedTime); // Expected output: "3 in the afternoon"
    }
}
