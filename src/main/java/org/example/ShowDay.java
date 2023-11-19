package org.example;

public class ShowDay {

    public static String getDayName(DaysOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
            case SUNDAY -> "Sunday";
        };
    }
}