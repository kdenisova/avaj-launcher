public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    public JetPlane(String name, Coordinates coordinates) {
        super(name, AircraftType.JetPlane, coordinates);
        this.name = name;
        this.coordinates = coordinates;
    }

    @Override
    public void updateConditions() throws Exception {
        switch (weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                System.out.println(this.getType() + "#" + this.name + "(" + this.id + "): It's a beautiful day to save lives.");
                changeLatitude(10);
                changeHeight(2);
                break;
            case "RAIN":
                System.out.println(this.getType() + "#" + this.name + "(" + this.id + "): It's raining. Better watch out for lightings.");
                changeLatitude(5);
                break;
            case "FOG":
                System.out.println(this.getType() + "#" + this.name + "(" + this.id + "): The fog comes on little cat feet.");
                changeLatitude(1);
                break;
            default:
                System.out.println(this.getType() + "#" + this.name + "(" + this.id + "): OMG! Winter is coming!");
                changeHeight(-7);
                break;
        }

        if (coordinates.getHeight() == 0) {
            weatherTower.unregister(this);
            System.out.println("Tower says: " + this.getType() + "#" + this.name + "(" + this.id + ") unregistered from weather tower.");
        }

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        System.out.println("Tower says: " + this.getType() + "#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
}
