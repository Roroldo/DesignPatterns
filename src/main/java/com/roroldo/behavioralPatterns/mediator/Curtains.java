package com.roroldo.behavioralPatterns.mediator;

/**
 * Curtains
 * @author 落霞不孤
 */
public class Curtains extends Colleague{
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    void sendMessage(int stateChange) {
        this.mediator.getMessage(stateChange, this.name);
    }

    public void upCurtains() {
        System.out.println("I am holding Up Curtains!");
    }
}
