package com.shivansh.weather_app.dto;

public class Current {

    private String time;
    private int interval;
    private double temperature_2m;
    private int relative_humidity_2m;
    private double wind_speed_10m;
    private int weather_code;

    public Current() {
    }

    public Current(String time,
                   int interval,
                   double temperature_2m,
                   int relative_humidity_2m,
                   double wind_speed_10m,
                   int weather_code) {

        this.time = time;
        this.interval = interval;
        this.temperature_2m = temperature_2m;
        this.relative_humidity_2m = relative_humidity_2m;
        this.wind_speed_10m = wind_speed_10m;
        this.weather_code = weather_code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public void setTemperature_2m(double temperature_2m) {
        this.temperature_2m = temperature_2m;
    }

    public int getRelative_humidity_2m() {
        return relative_humidity_2m;
    }

    public void setRelative_humidity_2m(int relative_humidity_2m) {
        this.relative_humidity_2m = relative_humidity_2m;
    }

    public double getWind_speed_10m() {
        return wind_speed_10m;
    }

    public void setWind_speed_10m(double wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m;
    }

    public int getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(int weather_code) {
        this.weather_code = weather_code;
    }
}