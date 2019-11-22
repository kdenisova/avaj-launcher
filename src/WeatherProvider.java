

public class WeatherProvider {
    private static WeatherProvider weatherProvider;
    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {
    }

    public static WeatherProvider getProvider() {
        if (weatherProvider == null) {
            weatherProvider = new WeatherProvider();
        }

        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        int currentWeather = coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight();
        return weather[currentWeather % 4];
    }
}