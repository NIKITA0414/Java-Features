package com.example.javafeatures.java17.sealedclasses;

public sealed abstract class Shape
        permits Circle, Rectangle, Triangle {

    // Common behavior or properties for shapes
    public abstract double area();
}

