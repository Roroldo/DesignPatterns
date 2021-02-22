package com.roroldo.behavioralPatterns.observer.improve;

/**
 * 百度气象
 * @author 落霞不孤
 */
public class BaiduWeather extends Observer{
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("***BaiduWeather temperature: " + temperature + "***");
        System.out.println("***BaiduWeather pressure: " + pressure + "***");
        System.out.println("***BaiduWeather humidity: " + humidity + "***");
    }
}
