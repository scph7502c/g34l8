package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test

    public void testCircle() {
        // Given
        Circle circle = new Circle(5);

        // When
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        // Then
        assertEquals(78.54, area);
        assertEquals(31.42, perimeter);

    }
}