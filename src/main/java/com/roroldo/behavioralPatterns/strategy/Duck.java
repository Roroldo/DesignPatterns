package com.roroldo.behavioralPatterns.strategy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 所有的鸭子父类
 * @author 落霞不孤
 */
@NoArgsConstructor
@Setter
@Getter
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    abstract void display();

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void performQuark() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        System.out.println("所有的鸭子都能游泳，因为它们能在水面上漂浮起来~");
    }
}
