package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }
}