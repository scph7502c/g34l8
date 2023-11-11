package org.example;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side * 100.0) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(4 * side * 100.0) / 100.0;
    }
}
