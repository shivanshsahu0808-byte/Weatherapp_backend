package com.shivansh.weather_app.service;

import com.shivansh.weather_app.dto.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@Service
public class WeatherService {

    @Value("${weather.api.url}")
    private String apiurl;

    @Value("${geocoding.api.url}")
    private String geocodingApiUrl;

    private RestTemplate template = new RestTemplate();


    public WeatherResources getData(String city) {

        // 1. Encode city name
        String encodedCity =
                URLEncoder.encode(city, StandardCharsets.UTF_8);


        // 2. Geocoding API call

        String url = geocodingApiUrl
                + "?name=" + encodedCity
                + "&count=1";

        GeocodingResponse response =
                template.getForObject(
                        url,
                        GeocodingResponse.class
                );


        // 3. Check city

        if (response == null ||
                response.getResults() == null ||
                response.getResults().isEmpty()) {

            throw new RuntimeException("City not found");
        }


        // 4. Extract location information

        Result result =
                response.getResults().get(0);

        String cityName =
                result.getName();

        String country =
                result.getCountry();

        String region =
                result.getAdmin1();

        double latitude =
                result.getLatitude();

        double longitude =
                result.getLongitude();


        // 5. Weather API call

        String weatherUrl = apiurl
                + "?latitude=" + latitude
                + "&longitude=" + longitude
                + "&current=temperature_2m,relative_humidity_2m,wind_speed_10m,weather_code"
                + "&daily=temperature_2m_mean,temperature_2m_max,weather_code"
                + "&forecast_days=3"
                + "&timezone=auto";


        WeatherResponse weatherResponse =
                template.getForObject(
                        weatherUrl,
                        WeatherResponse.class
                );


        // 6. Current weather data

        double temperature =
                weatherResponse
                        .getCurrent()
                        .getTemperature_2m();
        int weatherCode =
                weatherResponse
                        .getCurrent()
                        .getWeather_code();

        String condition;

        if (weatherCode == 0) {
            condition = "Clear Sky";
        } else if (weatherCode >= 1 && weatherCode <= 3) {
            condition = "Cloudy";
        } else if (
                (weatherCode >= 51 && weatherCode <= 67) ||
                        (weatherCode >= 80 && weatherCode <= 82)
        ) {
            condition = "Rain";
        } else if (weatherCode >= 71 && weatherCode <= 77) {
            condition = "Snow";
        } else if (weatherCode >= 95) {
            condition = "Thunderstorm";
        } else {
            condition = "Unknown";
        }

        double humidity =
                weatherResponse
                        .getCurrent()
                        .getRelative_humidity_2m();

        double windSpeed =
                weatherResponse
                        .getCurrent()
                        .getWind_speed_10m();

        String time =
                weatherResponse
                        .getCurrent()
                        .getTime();


        // 7. Forecast data

        ArrayList<Forecast> forecastList =
                new ArrayList<>();

        ArrayList<String> dates =
                weatherResponse
                        .getDaily()
                        .getTime();

        ArrayList<Double> averageTemperatures =
                weatherResponse
                        .getDaily()
                        .getTemperature_2m_mean();

        ArrayList<Double> maximumTemperatures =
                weatherResponse
                        .getDaily()
                        .getTemperature_2m_max();

        ArrayList<Integer> weatherCodes =
                weatherResponse
                        .getDaily()
                        .getWeather_code();


        // 8. Create Forecast objects

        for (int i = 0; i < dates.size(); i++) {

            Forecast forecast = new Forecast(
                    dates.get(i),
                    averageTemperatures.get(i),
                    maximumTemperatures.get(i),
                    weatherCodes.get(i)
            );

            forecastList.add(forecast);
        }


        // 9. Final response

        return new WeatherResources(
                cityName,
                country,
                region,
                temperature,
                humidity,
                windSpeed,
                time,
                weatherCode,
                condition,
                forecastList
        );
    }
}