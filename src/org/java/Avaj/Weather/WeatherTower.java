package org.java.Avaj.Weather;

import org.java.Avaj.Flyables.Coordinates;
import org.java.Avaj.Flyables.Flyable;

public class WeatherTower extends Tower {
    private WeatherProvider weatherProvider;

    public WeatherTower(WeatherProvider weatherProvider) {
        this.weatherProvider = weatherProvider;
    }

    public String getWeather(Coordinates coordinates) {
        return weatherProvider.getCurrentWeather(coordinates);
    }

    public void changeWeather() throws Exception {
        super.conditionsChanged();
    }

    @Override
    protected void registerSpecificTower(Flyable flyable) {
        flyable.registerTower(this);
    }
}
