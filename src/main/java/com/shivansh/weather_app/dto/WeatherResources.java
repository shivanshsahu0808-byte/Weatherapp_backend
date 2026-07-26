package com.shivansh.weather_app.dto;

import java.util.ArrayList;

public class WeatherResources {

    private String city;
    private String country;
    private String region;

    private double temperature;
    private double humidity;
    private double windSpeed;

    private String time;

    private int weatherCode;
    private String condition;

    private ArrayList<Forecast> forecast;


    public WeatherResources(
            String city,
            String country,
            String region,
            double temperature,
            double humidity,
            double windSpeed,
            String time,
            int weatherCode,
            String condition,
            ArrayList<Forecast> forecast
    ) {
        this.city = city;
        this.country = country;
        this.region = region;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.time = time;
        this.weatherCode = weatherCode;
        this.condition = condition;
        this.forecast = forecast;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }


    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }


    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    public ArrayList<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(ArrayList<Forecast> forecast) {
        this.forecast = forecast;
    }
}