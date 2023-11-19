package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test

    public void testCatName() {
        Cat cat = new Cat("Tom");
        assertEquals("Tom", cat.getCatName());
    }

}