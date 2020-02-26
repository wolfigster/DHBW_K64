import observer.LogisticCenter;
import observer.Truck;
import observer.TruckSensor;
import observer.Zone;
import state.Loading;

public class Application {
    /*
Ein Logistikzentrum verfügt über fünf Zonen fur die Be-/Entladung von LKW. Jede Zone ist mit
einem Sensor ausgestattet, welcher die Ankunft eines LKW registriert und einen Mitarbeiter per
SMS automatisch informiert. Jede Zone verfügt ein Rolltor, welche über einen Taster geöffnet und
geschlossen wird. Initial ist das Rolltor geschlossen. Der Mitarbeiter drückt den Taster und das
Rolltor wird geöffnet. Der LKW wird entladen. Der Mitarbeiter drückt erneut den Taster und das
Rolltor wird geschlossen.

     */
    public static void main(String... args) {
        Truck truck01 = new Truck("B-AM-143", false);
        Truck truck02 = new Truck("FR-ZK-9183", true);
        LogisticCenter logisticCenter = new LogisticCenter();

        TruckSensor truckSensor = new TruckSensor();
        truckSensor.addListener(logisticCenter);
        truckSensor.testTruckArrives();

        Zone zone01 = logisticCenter.getZoneByIndex(1);
        Zone zone02 = logisticCenter.getZoneByIndex(3);
        logisticCenter.truckArrives(zone01 , truck01);
        logisticCenter.truckArrives(zone02 , truck02);

        while (logisticCenter.getLoadings().size() > 0) {
            for (Loading loading : logisticCenter.getLoadings()) {
                if (loading.getState().toString().equals("Finished")) {
                    loading.promote();
                    logisticCenter.removeLoading(loading);
                    break;
                }
                loading.promote();
            }
        }
    }
}
