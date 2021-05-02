package com.example.hypermetro.commands;

import com.example.hypermetro.metro.Metro;

public record ConnectCommand(
        String line1, String station1,
        String line2, String station2) implements Command {

    @Override
    public void execute() {
        Metro.INSTANCE.connect(line1, station1, line2, station2);
    }
}
