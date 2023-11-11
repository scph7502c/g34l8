package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareWithInterfaceTest {

    @Test
    public void checkSquareAreaAndPerimeter() {
        // given
        SquareWithInterface square = new SquareWithInterface(5);

        // when
        double area = square.getArea();
        double perimeter = square.getPerimeter();

        // then
        assertEquals(25, area, 0.01);
        assertEquals(20, perimeter, 0.01);
    }
}