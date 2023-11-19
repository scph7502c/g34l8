package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowDayTest {

    @Test
    public void checkDayName() {
        // given
        ShowDay test = new ShowDay();
        DaysOfWeek day = DaysOfWeek.THURSDAY;

        // when
        String dayName = test.getDayName(day);

        // then
        assertEquals("Thursday", dayName);
    }
}