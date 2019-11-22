public interface Flyable {
    void updateConditions() throws Exception;
    void registerTower(WeatherTower weatherTower);
}
