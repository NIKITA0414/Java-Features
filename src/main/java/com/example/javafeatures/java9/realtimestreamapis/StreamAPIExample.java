package com.example.javafeatures.java9.realtimestreamapis;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Alice", 150.0));
        orders.add(new Order("Bob", 90.0));
        orders.add(new Order("Charlie", 200.0));
        orders.add(new Order("David", 50.0));

        // Using takeWhile to find orders eligible for free shipping (total > 100)
        List<Order> eligibleOrders = orders.stream()
                .takeWhile(order -> order.getTotalAmount() > 100)
                .toList();

        System.out.println("Eligible Orders for Free Shipping:");
        eligibleOrders.forEach(System.out::println);

        // Using dropWhile to find orders that are not eligible (total <= 100)
        List<Order> nonEligibleOrders = orders.stream()
                .dropWhile(order -> order.getTotalAmount() > 100)
                .toList();

        System.out.println("\nNon-Eligible Orders:");
        nonEligibleOrders.forEach(System.out::println);

        // Using Stream.ofNullable
        Order nullOrder = null;
        Stream<Order> orderStream = Stream.ofNullable(nullOrder);
        System.out.println("\nStream from a nullable order:");
        orderStream.forEach(System.out::println); // Will print nothing since it's null

        // Using iterate with a predicate (to generate a stream of integers)
        System.out.println("\nIterate example:");
        Stream.iterate(1, n -> n <= 10, n -> n + 1)
                .forEach(System.out::println);
    }
}