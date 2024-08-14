package com.group.libraryapp.dto.example;

import java.time.LocalDate;

public class DayOfTheWeekResponse {
    private String dayOfTheWeek;

    public DayOfTheWeekResponse(String dayOfTheWeek) {
        LocalDate tmp = LocalDate.parse(dayOfTheWeek);
        this.dayOfTheWeek = tmp.getDayOfWeek().name();
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek.substring(0, dayOfTheWeek.length() - 3);
    }

}
