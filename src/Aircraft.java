public abstract class Aircraft {
    private AircraftType type;

    protected long id;
    protected String name;
    protected Coordinates coordinates;

    private static long idCounter = 0;

    protected Aircraft(String name, AircraftType type, Coordinates coordinates) {
       this.name = name;
       this.type = type;
       this.coordinates = coordinates;
       this.id = this.nextId();
    }

    private long nextId() {
        return ++(idCounter);
    }

    private boolean checkTooLow(int height) {
        return height <= 0;
    }

    private boolean checkTooHigh(int height) {
        return height >= 100;
    }

    public void changeLongitude(int longitude) {
        this.coordinates = new Coordinates(coordinates.getLongitude() + longitude, coordinates.getLatitude(), coordinates.getHeight());
    }

    public void changeLatitude(int latitude) {
        this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + latitude, coordinates.getHeight());
    }

    public void changeHeight(int height) {
        if (checkTooLow(coordinates.getHeight() + height)) {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), 0);
            System.out.println(this.getType() + "#" + this.name + "(" + this.id + ") landing");
        } else if (checkTooHigh(coordinates.getHeight() + height)) {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), 100);
        }
        else
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() + height);
    }

    protected AircraftType getType() {
        return type;
    }

}
