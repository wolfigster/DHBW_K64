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


        Zone zone01 = logisticCenter.getZoneByIndex(1);
        zone01.truckArrives(truck01);
        Zone zone02 = logisticCenter.getZoneByIndex(3);
        zone02.truckArrives(truck02);

        for(Zone zone : logisticCenter.getZones()) {
            while(zone.getLoading() != null) zone.getLoading().promote();
        }
    }
}
