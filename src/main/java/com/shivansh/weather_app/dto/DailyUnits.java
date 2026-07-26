package com.shivansh.weather_app.dto;

public class DailyUnits {

    private String time;
    private String temperature_2m_mean;
    private String temperature_2m_max;

    public DailyUnits() {
    }

    public String getTime() {
        return time;
    }

    public String getTemperature_2m_mean() {
        return temperature_2m_mean;
    }

    public String getTemperature_2m_max() {
        return temperature_2m_max;
    }
}