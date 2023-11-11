package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsoleMessageTest {
    @Test
    public void checkConsoleMessageClassName() {
        //given
        Message ConsoleMessage = new ConsoleMessage();
        //when
        String expectedMessage = "This is class ConsoleMessage";
        //then
        assertEquals(expectedMessage, ConsoleMessage.getMessage());
    }
}