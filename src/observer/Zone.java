package observer;

import state.Arrived;
import state.Loading;

public class Zone implements ITruckSensorListener{

    private String name;
    private Employee employee;
    private Button button;
    private RollingGate rollingGate;
    private Loading loading;

    public Zone(String name) {
        this.name = name;
        employee = new Employee("Employee01");
        button = new Button();
        rollingGate = new RollingGate();
        loading = null;
    }

    public String getName() {
        return name;
    }

    public void messageEmployee() {
        System.out.println("--- " + employee.getName() + " was informed");
    }

    public void employeePushButton() {
        employee.pushButton(button, rollingGate);
    }

    @Override
    public void truckArrives(Truck truck) {
        loading = new Loading(this, truck);
        loading.setState(new Arrived());
    }

    public void truckLeaves() {
        loading = null;
        System.out.println("--- Truck leaves the zone: " + name);
    }

    public Loading getLoading() {
        return this.loading;
    }
}
