package com.example.javafeatures.java17.sealedclasses;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Triangle Area: " + triangle.area());
    }
}
/*
-Sealed Class: Shape is declared as a sealed class and can only be extended by Circle and Rectangle.
-Permitted Subclasses: Circle and Rectangle are both final subclasses of Shape. Being final means they cannot be extended further.
-Non-Sealed Subclass: Triangle is declared as non-sealed, allowing it to be extended by other classes if needed.
-Method Implementation: Each shape class implements the area() method, allowing for polymorphic behavior when calculating the area.*/
