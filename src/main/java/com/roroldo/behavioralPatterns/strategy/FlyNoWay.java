package com.roroldo.behavioralPatterns.strategy;

/**
 * 不能飞行
 * @author 落霞不孤
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞行~");
    }
}
