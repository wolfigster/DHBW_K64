package observer;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void pushButton(Button button, RollingGate rollingGate) {
        button.push(rollingGate);
    }

    public String getName() {
        return name;
    }
}
