package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerCaseTest {
    @Test
    public void checkLowerCase() {
        // given
        LowerCaseFormatter formatter = new LowerCaseFormatter();
        String inputText = "FUTURE Collars";

        // when
        String formattedText = formatter.formatText(inputText);

        // then
        assertEquals("future collars", formattedText);
    }

    @Test
    public void checkIfLowerCaseIsNull() {
        // given
        LowerCaseFormatter formatter = new LowerCaseFormatter();
        String inputText = null;

        // when
        String formattedText = formatter.formatText(inputText);

        // then
        assertEquals("", formattedText);
    }
}