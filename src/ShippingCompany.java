import java.util.ArrayList;

public abstract class ShippingCompany {
    protected ArrayList<StoreGeneric> storeGeneric;

    protected ShippingCompany() {
        this.storeGeneric = new ArrayList<>();
    }

    public void addStore(StoreGeneric storeGeneric){
        this.storeGeneric.add(storeGeneric);
    }

    public void removeStore(StoreGeneric storeGeneric){
        this.storeGeneric.remove(storeGeneric);
    }

    public abstract void notifyStore();

    protected ArrayList<StoreGeneric> getStores() {
        return storeGeneric;
    }


}
