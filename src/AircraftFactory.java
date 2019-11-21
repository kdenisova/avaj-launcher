public class AircraftFactory {
    public Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        switch (type.toLowerCase()) {
            case "helicopter":
                return new Helicopter(name, type, coordinates);
            case "jetplane":
                return new Helicopter(name, type, coordinates);
            case "baloon":
                return new Helicopter(name, type, coordinates);
        }
        return null;
    }
}
