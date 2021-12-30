package com.example.hypermetro.exception;

public class LineNotFoundException extends RuntimeException {
    public LineNotFoundException(String name) {
        super(String.format("Line \"%s\" not found", name));
    }
}
