package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test

    public void testRectangle() {
        // Given
        Rectangle rectangle = new Rectangle(5, 10);

        // When
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        // Then
        assertEquals(50, area);
        assertEquals(30, perimeter);
    }
}