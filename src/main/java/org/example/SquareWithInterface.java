package org.example;

public class SquareWithInterface implements AreaPerimeter {
    private double side;

    public SquareWithInterface(double side) {
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