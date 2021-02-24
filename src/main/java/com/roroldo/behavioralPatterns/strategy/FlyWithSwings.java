package com.roroldo.behavioralPatterns.strategy;

/**
 * 可以飞行
 * @author 落霞不孤
 */
public class FlyWithSwings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("可以飞起来");
    }
}
