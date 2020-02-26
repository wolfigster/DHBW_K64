package observer;

public class Zone {

    private String name;
    private Employee employee;
    private Button button;
    private RollingGate rollingGate;

    public Zone(String name) {
        this.name = name;
        employee = new Employee("Employee01");
        button = new Button();
        rollingGate = new RollingGate();
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
}
