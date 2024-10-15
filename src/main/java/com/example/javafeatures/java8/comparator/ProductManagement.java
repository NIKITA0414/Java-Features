package com.example.javafeatures.java8.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProductManagement {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 800.00),
                new Product("Smartphone", 600.00),
                new Product("Tablet", 300.00),
                new Product("Smartwatch", 250.00),
                new Product("Headphones", 100.00)
        );

        // 1. Sort products by price (natural order)
        List<Product> sortedByPrice = new ArrayList<>(products);
        sortedByPrice.sort(Comparator.comparingDouble(Product::getPrice));

        // 2. Sort products by price (reverse order)
        List<Product> sortedByPriceDesc = new ArrayList<>(products);
        sortedByPriceDesc.sort(Comparator.comparingDouble(Product::getPrice).reversed());

        // 3. Sort products by name
        List<Product> sortedByName = new ArrayList<>(products);
        sortedByName.sort(Comparator.comparing(Product::getName));

        // Output results
        System.out.println("Products sorted by price (ascending): " + sortedByPrice);
        System.out.println("Products sorted by price (descending): " + sortedByPriceDesc);
        System.out.println("Products sorted by name: " + sortedByName);
    }
}