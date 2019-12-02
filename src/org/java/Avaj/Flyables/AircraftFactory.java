package org.java.Avaj.Flyables;

import org.java.Avaj.AvajLauncherException;

public abstract class AircraftFactory {
    public static Flyable newAircraft(AircraftType type, String name, int longitude, int latitude, int height) throws Exception {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);

            switch (type) {
                case Helicopter:
                    return new Helicopter(name, coordinates);
                case JetPlane:
                    return new JetPlane(name, coordinates);
                case Baloon:
                    return new Baloon(name, coordinates);
            }

        throw new AvajLauncherException("Unknown aircraft type: " + type);
    }
}
