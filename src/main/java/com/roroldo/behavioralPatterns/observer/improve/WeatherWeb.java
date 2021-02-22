package com.roroldo.behavioralPatterns.observer.improve;

/**
 * 气象站官网
 * @author 落霞不孤
 */
public class WeatherWeb extends Observer{
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println("***WeatherWeb temperature: " + temperature + "***");
        System.out.println("***WeatherWeb pressure: " + pressure + "***");
        System.out.println("***WeatherWeb humidity: " + humidity + "***");
    }
}
