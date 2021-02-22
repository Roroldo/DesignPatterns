package com.roroldo.behavioralPatterns.observer.improve;

/**
 * 观察者
 * @author 落霞不孤
 */
public abstract class Observer {
    protected float temperature;
    protected float pressure;
    protected float humidity;

    protected abstract void update(float temperature, float pressure, float humidity);

    public abstract void display();
}
