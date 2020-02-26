package state;

public class Unloaded implements ILoadingtate {
    @Override
    public void promote(Loading loading) {
        System.out.println(loading.getTruck().getLicensePlate() + " > promotion: unloaded ->  finished");
        loading.getZone().employeePushButton();
        loading.setState(new Finished());
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("--- printing information about state of the truck: unloaded");
    }

    public String toString() {
        return "Unloaded";
    }
}
