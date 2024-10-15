package com.example.javafeatures.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class EnhancedRandomExample {
    public static void main(String[] args) {
        // Create a random generator using the default implementation
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L128X256MixRandom").create();

        // Generate some random integers
        System.out.println("Random Integers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomGenerator.nextInt(100)); // Random integer between 0 and 99
        }

        // Generate some random doubles
        System.out.println("\nRandom Doubles:");
        for (int i = 0; i < 5; i++) {
            System.out.println(randomGenerator.nextDouble()); // Random double between 0.0 and 1.0
        }

        // Creating a new random generator with a specific seed
        RandomGenerator seededGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(12345);
        System.out.println("\nRandom Integers from Seeded Generator:");
        for (int i = 0; i < 5; i++) {
            System.out.println(seededGenerator.nextInt(100));
        }
    }
}
