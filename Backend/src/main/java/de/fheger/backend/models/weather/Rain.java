package de.fheger.backend.models.weather;

public record Rain(int probability,
                   int min,
                   int max,
                   int durationPerHour) {
}
