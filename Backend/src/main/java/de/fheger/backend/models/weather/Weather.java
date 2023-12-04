package de.fheger.backend.models.weather;

public record Weather(String town,
                      WeatherRecord current,
                      WeatherRecord[] forecast) {
}
