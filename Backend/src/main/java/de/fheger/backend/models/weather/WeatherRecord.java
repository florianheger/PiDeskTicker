package de.fheger.backend.models.weather;

import java.time.LocalDateTime;

public record WeatherRecord(
        LocalDateTime datetime,
        Temperature temperature,
        Rain rain,
        Wind wind
) {

}