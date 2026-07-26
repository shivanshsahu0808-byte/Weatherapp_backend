package com.shivansh.weather_app.dto;

import java.util.ArrayList;

public class Daily {

    private DailyUnits units;

    private ArrayList<String> time;

    private ArrayList<Double> temperature_2m_mean;

    private ArrayList<Double> temperature_2m_max;

    private ArrayList<Integer> weather_code;


    public Daily() {
    }


    public ArrayList<String> getTime() {
        return time;
    }


    public ArrayList<Double> getTemperature_2m_mean() {
        return temperature_2m_mean;
    }


    public ArrayList<Double> getTemperature_2m_max() {
        return temperature_2m_max;
    }


    public ArrayList<Integer> getWeather_code() {
        return weather_code;
    }
}
