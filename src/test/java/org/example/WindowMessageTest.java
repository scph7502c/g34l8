package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowMessageTest {
    @Test
    public void checkWindowsMessageClassName() {
        //given
        WindowMessage windowMessage = new WindowMessage();
        //when
        String expectedMessage = "This is class WindowMessage";
        //then
        assertEquals(expectedMessage, windowMessage.getMessage());
    }
}