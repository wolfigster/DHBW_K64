package state;

public class Finished implements ILoadingtate {
    @Override
    public void promote(Loading loading) {
        System.out.println(loading.getTruck().getLicensePlate() + " > promotion: ---->  finished");
        loading.getZone().messageEmployee();
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("--- printing information about state of the truck: finished");
    }

    public String toString() {
        return "Finished";
    }
}
