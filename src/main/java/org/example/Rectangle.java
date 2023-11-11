package org.example;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return Math.round(length * width * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (length + width) * 100.0) / 100.0;
    }
}