package org.java.Avaj.Flyables;

import org.java.Avaj.Weather.WeatherTower;

public interface Flyable {
    public void updateConditions() throws Exception;
    public void registerTower(WeatherTower weatherTower);
}
