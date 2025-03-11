package com.ironhack.alexardelean.weatherService;

import com.ironhack.alexardelean.model.Weather;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class WeatherService {
    private  int temperature=new Random().nextInt(-10,41);
    private  int randomCondition=new Random().nextInt(0,4);
    private String condition;
    private  int windSpeed=new Random().nextInt(0,101);

    public int getTemperature() {
        return temperature;
    }

    public String getCondition() {
        if(randomCondition==0) {
            condition="Sunny";
        }else if(randomCondition==1) {
            condition="Cloudy";
        }
        else if(randomCondition==2) {
            condition="Rainy";
        } else if (randomCondition==3) {
            condition="Windy";

        }
        return condition;
    }
    public int getWindSpeed() {
        return windSpeed;
    }
    public Weather getWeather() {
        return new Weather(temperature,getCondition(),windSpeed);
    }



}
