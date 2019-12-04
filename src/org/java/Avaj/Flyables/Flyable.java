package org.java.Avaj.Flyables;

import org.java.Avaj.Weather.WeatherTower;

public interface Flyable {
    void updateConditions() throws Exception;
    void registerTower(WeatherTower weatherTower);
}
