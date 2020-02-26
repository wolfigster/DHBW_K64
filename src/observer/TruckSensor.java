package observer;

import java.util.ArrayList;

public class TruckSensor {
    private ArrayList<ITruckSensorListener> listeners;

    public TruckSensor() {
        listeners = new ArrayList<>();
    }

    public void testTruckArrives() {
        for(ITruckSensorListener listener : listeners) {
            listener.truckArrives(new Truck("S-PL-293", false));
        }
    }

    public void addListener(ITruckSensorListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ITruckSensorListener listener) {
        listeners.remove(listener);
    }
}
