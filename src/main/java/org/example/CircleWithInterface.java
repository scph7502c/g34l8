package org.example;

public class CircleWithInterface implements AreaPerimeter {
    private double radius;

    public CircleWithInterface(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}