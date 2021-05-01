package com.example.hypermetro.commands;


import com.example.hypermetro.metro.Metro;

public record AddHeadCommand(String line, String station) implements Command {

    @Override
    public void execute() {
        Metro.INSTANCE.addStation(line, station);
    }
}
