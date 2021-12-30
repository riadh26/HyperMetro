package com.example.hypermetro.commands;


import com.example.hypermetro.metro.Metro;

public record OutputCommand(String line) implements Command {

    @Override
    public void execute() {
        Metro.INSTANCE.outputLine(line);
    }
}
