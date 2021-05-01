package com.example.hypermetro.exception;

public class CommandNotFoundException extends RuntimeException {
    public CommandNotFoundException() {
        super("Invalid command");
    }
}
