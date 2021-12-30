package com.example.hypermetro.exception;

public class StationNotFoundException extends RuntimeException {
    public StationNotFoundException(String name) {
        super(String.format("Station \"%s\" not found", name));
    }
}
