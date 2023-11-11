package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test

    public void testSquare() {
        // Given
        Square square = new Square(5);

        // When
        double area = square.getArea();
        double perimeter = square.getPerimeter();

        // Then
        assertEquals(25, area);
        assertEquals(20, perimeter);
    }
}