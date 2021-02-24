package com.roroldo.behavioralPatterns.strategy;

/**
 * 叫声二
 * @author 落霞不孤
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎叫！");
    }
}
