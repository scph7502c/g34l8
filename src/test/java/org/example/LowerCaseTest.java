package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerCaseTest {
    @Test
    public void checkLowerCase() {
        // given
        LowerCase formatter = new LowerCase();
        String inputText = "FUTURE Collars";

        // when
        String formattedText = formatter.formatText(inputText);

        // then
        assertEquals("future collars", formattedText);
    }
}