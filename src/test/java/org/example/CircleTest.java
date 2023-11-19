package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void checkCircleAreaAndPerimeter() {
        // given
        Circle circle = new Circle(3);

        // when
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        // then
        assertEquals(28.27, area, 0.01);
        assertEquals(18.84, perimeter, 0.01);
    }
}