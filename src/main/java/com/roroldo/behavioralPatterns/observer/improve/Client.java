package com.roroldo.behavioralPatterns.observer.improve;

/**
 * 客户端
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer baiduWeather = new BaiduWeather();
        Observer weatherWeb = new WeatherWeb();
        weatherData.registerObserver(baiduWeather);
        weatherData.registerObserver(weatherWeb);

        // 通知各个天气节点今天的天气
        weatherData.setWeatherData(20f, 150f, 22.0f);
        baiduWeather.display();
        System.out.println("=================================");
        weatherWeb.display();
        System.out.println();
        // 天气发生变化
        weatherData.setWeatherData(10f, 120f, 28.0f);
        baiduWeather.display();
        System.out.println("=================================");
        weatherWeb.display();
        // 移除百度天气站点
        System.out.println("移除百度天气站点");
        weatherData.remove(baiduWeather);
        weatherData.setWeatherData(25f, 120f, 28.0f);
        baiduWeather.display();
    }
}
