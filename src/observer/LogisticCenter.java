package observer;

import java.util.ArrayList;

public class LogisticCenter {
    private ArrayList<Zone> zones = new ArrayList<>();

    public LogisticCenter() {
        for(int i = 1; i <= 5; i++) {
            TruckSensor truckSensor = new TruckSensor();
            Zone zone = new Zone("Zone #" + i);
            truckSensor.addListener(zone);
            zones.add(zone);
        }
    }

    public ArrayList<Zone> getZones() {
        return zones;
    }

    public Zone getZoneByIndex(int index) {
        return zones.get(index);
    }
}
