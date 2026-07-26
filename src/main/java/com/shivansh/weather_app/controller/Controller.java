package com.shivansh.weather_app.controller;

import com.shivansh.weather_app.dto.WeatherResources;
import com.shivansh.weather_app.service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/weather")
public class Controller {

    @Autowired
    private WeatherService service;

    @GetMapping("/{city}")
    public WeatherResources getWeather(
            @PathVariable String city
    ) {

        return service.getData(city);
    }
}