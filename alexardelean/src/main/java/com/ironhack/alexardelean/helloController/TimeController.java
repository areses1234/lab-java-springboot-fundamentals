package com.ironhack.alexardelean.helloController;

import com.ironhack.alexardelean.weatherService.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;
    public TimeController(TimeService timeService, TimeService timeService1) {
        this.timeService = timeService1;
    }
    @GetMapping("/time")
    public String getCurrentTime(){
        return "The current time is " + timeService.getCurrentTime();
    }
    @GetMapping("/date")
    public String getCurrentDate(){
        return "The current date is " + timeService.getCurrentDate();
    }
    @GetMapping("/day")
    public String getDayOfWeek(){
        return "The current day is " + timeService.getDayOfWeek();
    }
    @GetMapping("/all")
    public String getAll(){
        return timeService.getAll();
    }

}
