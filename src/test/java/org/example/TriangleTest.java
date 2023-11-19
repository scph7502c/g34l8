package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void checkTriangleData() {
        // given
        double width = 5.0;
        double height = 10.0;
        Triangle triangle = new Triangle(width, height);

        // when
        String result = triangle.toString();

        // then
        String expected = "org.example.Triangle@" + Integer.toHexString(triangle.hashCode()) + " Triangle{width=" + width + ", height=" + height + "}";
        assertEquals(expected, result);
    }
}

