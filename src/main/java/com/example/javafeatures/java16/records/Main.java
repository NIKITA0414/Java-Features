package com.example.javafeatures.java16.records;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(3.0, 4.0);
        Point p3 = new Point(5.0, 6.0);

        // Accessing fields
        System.out.println("Point 1: " + p1);
        System.out.println("X coordinate: " + p1.x());
        System.out.println("Y coordinate: " + p1.y());

        // Comparing records
        System.out.println("p1 equals p2: " + p1.equals(p2)); // true
        System.out.println("p1 equals p3: " + p1.equals(p3)); // false

        // Hash codes
        System.out.println("Hash code of p1: " + p1.hashCode());
        System.out.println("Hash code of p2: " + p2.hashCode());
        System.out.println("Hash code of p3: " + p3.hashCode());
    }
}
