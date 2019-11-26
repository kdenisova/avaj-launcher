import java.util.List;

public class Simulator {
    private List<String> scenario;

    public Simulator(List<String> scenario) {
        this.scenario = scenario;
    }

    public void Simulation() throws Exception {
        int numberOfSimulation = 0;
        int i = 0;

        //AircraftFactory factory = new AircraftFactory();
        Flyable flyable;
        WeatherTower weatherTower = new WeatherTower(WeatherProvider.getProvider());

        for (String item: scenario) {
            if (i == 0) {
                i = 1;
                try {
                    numberOfSimulation = Integer.parseInt(item);
                } catch (NumberFormatException e) {
                    throw new AvajLauncherException("Wrong format of Number of Simulation: " + e.getMessage());
                }
            }
            else {
                String[] result = item.split(" ");

                try {

                    flyable = AircraftFactory.newAircraft(
                            AircraftType.valueOf(result[0]),
                            result[1],
                            Integer.parseInt(result[2]),
                            Integer.parseInt(result[3]),
                            Integer.parseInt(result[4]));

                    weatherTower.register(flyable);
                } catch (NumberFormatException e) {
                    throw new AvajLauncherException("Wrong coordinate type: " + e.getMessage());
                } catch (Exception e) {
                    throw new AvajLauncherException(("Unknown aircraft type: " + result[0]));
                }


                //flyable.registerTower(weatherTower);


            }
        }

        while (numberOfSimulation-- != 0) {
            weatherTower.changeWeather();
        }
    }
}
