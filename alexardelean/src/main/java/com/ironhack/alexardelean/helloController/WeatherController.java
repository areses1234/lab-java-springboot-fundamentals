package com.ironhack.alexardelean.helloController;

import com.ironhack.alexardelean.model.Weather;
import com.ironhack.alexardelean.weatherService.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getTemperature() {
        return weatherService.getTemperature();
    }

    @GetMapping("/condition")
    public String getCondition() {
        return weatherService.getCondition();
    }

    @GetMapping("/windSpeed")
    public int getWindSpeed() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/weather")
    public Weather getWeather() {
        return weatherService.getWeather();
    }
}
