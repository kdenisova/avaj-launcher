public class WeatherProvider {
    private WeatherProvider weatherProvider;
    private String[] weather;

    private WeatherProvider() {

    }

    public WeatherProvider getWeatherProvider() {
        return this.weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        return "coordinates";//temp
    }

}
