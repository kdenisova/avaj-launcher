import java.util.List;

public class Simulator {
    private List<String> scenario;

    public Simulator(List<String> scenario) {
        this.scenario = scenario;
    }

    public void Simulation() throws Exception {
        int numberOfSimulation = 0;
        int i = 0;

        AircraftFactory factory = new AircraftFactory();
        Flyable flyable;
        WeatherTower weatherTower = new WeatherTower(WeatherProvider.getProvider());

        for (String item: scenario) {
            if (i == 0) {
                i = 1;
                numberOfSimulation = Integer.parseInt(item);
            }
            else {
                String[] result = item.split(" ");

                flyable = factory.newAircraft(
                        AircraftType.valueOf(result[0]),
                        result[1],
                        Integer.parseInt(result[2]),
                        Integer.parseInt(result[3]),
                        Integer.parseInt(result[4]));

                //flyable.registerTower(weatherTower);

                weatherTower.register(flyable);
            }
        }

        while (numberOfSimulation-- != 0) {
            weatherTower.changeWeather();
        }
    }
}
