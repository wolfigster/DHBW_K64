package state;

public class Loaded implements ILoadingtate {
    @Override
    public void promote(Loading loading) {
        System.out.println(loading.getTruck().getLicensePlate() + " > promotion: loaded ->  finished");
        loading.getZone().employeePushButton();
        loading.setState(new Finished());
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("--- printing information about state of the truck: loaded");
    }

    public String toString() {
        return "Loaded";
    }
}
