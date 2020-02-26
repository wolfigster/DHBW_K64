package state;

public class Arrived implements ILoadingtate {
    @Override
    public void promote(Loading loading) {
        System.out.println(loading.getTruck().getLicensePlate() + " > arrived");
        loading.getZone().messageEmployee();
        loading.getZone().employeePushButton();
        loading.setState(new Prepared());
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("--- printing information about state of the truck: arrived");
    }

    public String toString() {
        return "Arrived";
    }
}
