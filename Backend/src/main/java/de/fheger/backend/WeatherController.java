package de.fheger.backend;

import de.fheger.backend.models.weather.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.Arrays;

@Controller
public class WeatherController {
    @GetMapping("weather")
    @ResponseBody
    public Weather getWeather(@RequestParam String town) {
        WeatherRecord[] records = new WeatherRecord[10];
        for (int i = 0; i < records.length; i++) {
            records[i] = new WeatherRecord(
                    LocalDateTime.now(),
                    new Temperature(i, i),
                    new Rain(i, i, i, i),
                    new Wind(Wind.Direction.WEST, i++)
            );
        }
        Weather weather =  new Weather(town, records[0], Arrays.copyOfRange(records, 1, records.length));
        return weather;
    }
}
