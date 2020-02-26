package observer;

public class Truck {
    private String licensePlate;
    private boolean load; // true = load / false = unload

    public Truck(String licensePlate, boolean load) {
        this.licensePlate = licensePlate;
        this.load = load;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isLoad() {
        return load;
    }

    public void unload() {
        System.out.println("--- Truck was successfully unloaded");
    }

    public void load() {
        System.out.println("--- Truck was successfully loaded");
    }
}
