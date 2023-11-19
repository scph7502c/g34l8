package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testTriangle() {
        // Given
        Triangle triangle = new Triangle(3, 4, 5);

        // When
        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();

        // Then
        assertEquals(6, area);
        assertEquals(12, perimeter);
    }
}