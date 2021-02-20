package com.roroldo.behavioralPatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOffCommand implements Command {
    private LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.close();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
