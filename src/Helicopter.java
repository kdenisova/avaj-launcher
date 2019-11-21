public class Helicopter extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower;

    protected Helicopter(String name, String type, Coordinates coordinates) {
        super(name, type, coordinates);
        this.name = name;
        this.type = type;
        this.coordinates = coordinates;
    }

    @Override
    public void updateConditions() {
        switch (weatherTower.getWeather(this.coordinates)) {
            case "SUN":
                System.out.println(this.type + "#" + this.name + "(" + this.id + "): This is hot.");
                changeLongitude(10);
                changeHeight(2);
                break;
            case "RAIN":
                System.out.println(this.type + "#" + this.name + "(" + this.id + "): It's rain. I'm so scare!");
                changeLongitude(5);
                break;
            case "FOG":
                System.out.println(this.type + "#" + this.name + "(" + this.id + "): Fooooggggiiii!");
                changeLongitude(1);
                break;
            default:
                System.out.println(this.type + "#" + this.name + "(" + this.id + "): My rotor is going to freeze!");
                changeHeight(-12);
                break;
        }

        if (coordinates.getHeight() == 0) {
            weatherTower.unregister(this);
            System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") unregistered from weather tower.");
        }

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        System.out.println("Tower says: " + this.type + "#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
}
