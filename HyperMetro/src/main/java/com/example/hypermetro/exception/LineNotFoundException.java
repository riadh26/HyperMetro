package com.example.hypermetro.exception;

public class LineNotFoundException extends RuntimeException {
    public LineNotFoundException() {
        super("Line not found");
    }
}
