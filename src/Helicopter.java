public class Helicopter extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower;

    protected Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.name = name;
        this.coordinates = coordinates;
    }
    
    public void updateConditions() {
        
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        System.out.println("Tower says: Helicopter#" + this.name + "(" + this.id + ") registered to weather tower.");
    }
    
}
