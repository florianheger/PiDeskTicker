package de.fheger.backend.models.weather;

public record Wind(Direction direction, int speed) {
    public enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
}
