package com.roroldo.behavioralPatterns.observer.original;

import lombok.Getter;
import lombok.Setter;

/**
 * 天气数据
 * @author 落霞不孤
 */
@Getter
@Setter
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private WeatherWeb weatherWeb;

    public WeatherData(WeatherWeb weatherWeb) {
        this.weatherWeb = weatherWeb;
    }

    private void dataChange() {
        weatherWeb.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setNewWeatherData(float temperature, float pressure, float humidity) {
        setTemperature(temperature);
        setPressure(pressure);
        setHumidity(humidity);
        dataChange();
    }
}
