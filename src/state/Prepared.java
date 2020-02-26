package state;

public class Prepared implements ILoadingtate {
    @Override
    public void promote(Loading loading) {
        if(loading.getTruck().isLoad()) {
            System.out.println(loading.getTruck().getLicensePlate() + " > promotion: prepared ->  load");
            loading.getTruck().load();
            loading.setState(new Loaded());
        } else {
            System.out.println(loading.getTruck().getLicensePlate() + " > promotion: prepared ->  unload");
            loading.getTruck().unload();
            loading.setState(new Unloaded());
        }
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("--- printing information about state of the truck: prepared");
    }

    public String toString() {
        return "Prepared";
    }
}
