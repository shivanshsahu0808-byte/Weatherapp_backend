package com.shivansh.weather_app.dto;

import java.util.ArrayList;

public class GeocodingResponse {

    private ArrayList<Result> results;
    private double generationtime_ms;

    public GeocodingResponse() {
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }
}