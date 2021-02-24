package com.roroldo.behavioralPatterns.strategy;

/**
 * 可达鸭
 * @author 落霞不孤
 */
public class PsyDuck extends Duck {
    public PsyDuck() {
        this.flyBehavior = new FlyWithSwings();
        this.quackBehavior = new Squeak();
    }

    @Override
    void display() {
        System.out.println("这是一只可达鸭");
    }
}
