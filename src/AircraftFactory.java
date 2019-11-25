public class AircraftFactory {
    public Flyable newAircraft(AircraftType type, String name, int longitude, int latitude, int height) throws Exception {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

        switch (type) {
            case Helicopter:
                return new Helicopter(name, coordinates);
            case JetPlane:
                return new JetPlane(name, coordinates);
            case Baloon:
                return new Baloon(name, coordinates);
        }

        throw new Exception(String.format("unknown aircraft type: %s.", type));
    }
}
