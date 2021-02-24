package com.roroldo.behavioralPatterns.strategy;

/**
 * 叫声一
 * @author 落霞不孤
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("呱呱叫！");
    }
}
