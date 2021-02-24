package com.roroldo.behavioralPatterns.strategy;

/**
 * 橡皮鸭
 * @author 落霞不孤
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("这是一只橡皮鸭");
    }
}
