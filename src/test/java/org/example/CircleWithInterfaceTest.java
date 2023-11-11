package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleWithInterfaceTest {

    @Test
    public void checkCircleAreaAndPerimeter() {
        // given
        CircleWithInterface circle = new CircleWithInterface(3);

        // when
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        // then
        assertEquals(28.27, area, 0.01);
        assertEquals(18.84, perimeter, 0.01);
    }
}