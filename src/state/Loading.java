package state;

import observer.Truck;
import observer.Zone;

public class Loading {
    private ILoadingtate state;
    private Truck truck;
    private Zone zone;

    public Loading(Zone zone, Truck truck) {
        this.truck = truck;
        this.zone = zone;
    }

    public ILoadingtate getState() {
        return state;
    }

    public void setState(ILoadingtate state) {
        this.state = state;
    }

    public void promote() {
        System.out.println(toString());
        state.promote(this);
    }

    public String toString() {
        return "{ Load : state = " + state + " }";
    }

    public Truck getTruck() {
        return truck;
    }

    public Zone getZone() {
        return zone;
    }
}
