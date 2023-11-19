package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperCaseTest {
    @Test
    public void checkUpperCase() {
        // given
        UpperCase formatter = new UpperCase();
        String inputText = "future collars";

        // when
        String formattedText = formatter.formatText(inputText);

        // then
        assertEquals("FUTURE COLLARS", formattedText);
    }
}