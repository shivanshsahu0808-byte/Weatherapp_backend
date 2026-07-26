
package com.shivansh.weather_app.dto;

public class Days {

    private String time;
    private double temperature_2m_mean;
    private double temperature_2m_max;

    public Days() {
    }

    public String getTime() {
        return time;
    }

    public double getTemperature_2m_mean() {
        return temperature_2m_mean;
    }

    public double getTemperature_2m_max() {
        return temperature_2m_max;
    }
}