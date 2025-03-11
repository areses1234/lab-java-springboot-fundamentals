package com.ironhack.alexardelean.model;
public class Weather {
    private int temperature;
    private String condition;
    private int windSpeed;

    public Weather(int temperature, String condiotion, int windSpeed) {
        this.temperature = temperature;
        this.condition = condiotion;
        this.windSpeed = windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condiotion) {
        this.condition = condiotion;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}