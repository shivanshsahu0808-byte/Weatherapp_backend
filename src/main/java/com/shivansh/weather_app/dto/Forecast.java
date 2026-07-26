package com.shivansh.weather_app.dto;

public class Forecast {

    private String date;
    private double averageTemperature;
    private double maximumTemperature;
    private int weatherCode;


    public Forecast(String date,
                    double averageTemperature,
                    double maximumTemperature,
                    int weatherCode) {

        this.date = date;
        this.averageTemperature = averageTemperature;
        this.maximumTemperature = maximumTemperature;
        this.weatherCode = weatherCode;
    }


    public String getDate() {
        return date;
    }


    public double getAverageTemperature() {
        return averageTemperature;
    }


    public double getMaximumTemperature() {
        return maximumTemperature;
    }


    public int getWeatherCode() {
        return weatherCode;
    }
}