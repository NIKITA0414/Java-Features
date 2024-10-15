package com.example.javafeatures.java12;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatExample {
    public static void main(String[] args) {
        // Create a NumberFormat instance for compact numbers
        NumberFormat compactFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println(compactFormat.format(1500));   // Output: 1.5K
        System.out.println(compactFormat.format(2500000)); // Output: 2.5M
    }
}