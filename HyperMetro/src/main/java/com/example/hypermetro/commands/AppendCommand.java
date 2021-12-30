package com.example.hypermetro.commands;


import com.example.hypermetro.metro.Metro;

public record AppendCommand(String line, String station) implements Command {

    @Override
    public void execute() {
        Metro.INSTANCE.appendStation(line, station);
    }
}
