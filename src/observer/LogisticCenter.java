package observer;

import state.Arrived;
import state.Loading;

import java.util.ArrayList;

public class LogisticCenter implements ITruckSensorListener {
    private ArrayList<Zone> zones = new ArrayList<>();
    private ArrayList<Loading> loadings = new ArrayList<>();

    public LogisticCenter() {
        for(int i = 0; i < 5; i++) {
            Zone zone = new Zone("Zone #" + i);
            zones.add(zone);
        }
    }

    @Override
    public void truckArrives(Zone zone, Truck truck) {
        Loading loading = new Loading(zone, truck);
        loadings.add(loading);
        loading.setState(new Arrived());
    }

    public ArrayList<Zone> getZones() {
        return zones;
    }

    public Zone getZoneByIndex(int index) {
        return zones.get(index);
    }

    public ArrayList<Loading> getLoadings() {
        return loadings;
    }

    public void removeLoading(Loading loading) {
        loadings.remove(loading);
    }
}
