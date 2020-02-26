package observer;

public class RollingGate {

    private boolean opened = false;

    public void open() {
        opened = true;
        System.out.println("--- Rolling Gate was opened");
    }

    public void close() {
        opened = false;
        System.out.println("--- Rolling Gate was closed");
    }

    public boolean isOpened() {
        return opened;
    }
}
