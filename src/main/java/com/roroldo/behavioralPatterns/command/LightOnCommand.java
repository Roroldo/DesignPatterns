package com.roroldo.behavioralPatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LightOnCommand implements Command {
    private LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.close();
    }
}
