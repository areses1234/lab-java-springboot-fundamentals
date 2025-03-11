package com.ironhack.alexardelean.weatherService;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

@Service
public class TimeService {
    public LocalTime getCurrentTime() {
        return LocalTime.now().truncatedTo(ChronoUnit.SECONDS);
    }
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
    public DayOfWeek getDayOfWeek() {
        return LocalDate.now().getDayOfWeek();
    }
    public String getAll(){
        return "Current Time: "+getCurrentTime()+
                "\n"+"Current Date: "+getCurrentDate()+
                "\n"+"Current Day of the week: "+getDayOfWeek();
    }

}
