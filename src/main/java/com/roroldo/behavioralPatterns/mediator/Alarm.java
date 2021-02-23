package com.roroldo.behavioralPatterns.mediator;

/**
 * Alarm
 * @author 落霞不孤
 */
public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }


    public void sendAlarm(int stateChange) {
        sendMessage(stateChange);
    }
}
