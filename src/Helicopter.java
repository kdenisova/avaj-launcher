public class Helicopter extends Aircraft {
    
    private WeatherTower weatherTower;

    protected Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.name = name;
        this.coordinates = coordinates;
    }
    
    public void updateConditions() {
        
    }
    
    public void registerTower(WeatherTower weatherTower) {

    }
    
}
