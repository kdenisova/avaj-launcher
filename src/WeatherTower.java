public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        System.out.println(WeatherProvider.getProvider().getCurrentWeather(coordinates));
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    public void changeWeather() {

    }
}
