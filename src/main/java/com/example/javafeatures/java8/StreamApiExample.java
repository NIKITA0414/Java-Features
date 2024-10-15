package com.example.javafeatures.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter, map, and collect
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)           // Filter even numbers
                .map(n -> n * n)                   // Square each number
                .collect(Collectors.toList());      // Collect the results into a list

        // Print the result
        System.out.println("Even squares: " + evenSquares);
    }
}
