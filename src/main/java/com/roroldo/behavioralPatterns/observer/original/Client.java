package com.roroldo.behavioralPatterns.observer.original;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        WeatherWeb weatherWeb = new WeatherWeb();
        WeatherData weatherData = new WeatherData(weatherWeb);
        // 此时的天气
        weatherData.setNewWeatherData(20.0f, 150.0f, 20f);
        // 更新天气
        System.out.println("***********最新天气************");
        weatherData.setNewWeatherData(22.0f, 160.0f, 20f);
    }
}
