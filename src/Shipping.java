public class Shipping extends ShippingCompany {

    private String shipping;

    public void createShipping(String description){

        this.shipping = description;

        System.out.println("Se ha creado un nuevo envío.");

        this.notifyStore();
    }

    public String getShipping() {
        return shipping;
    }

    @Override
    public void notifyStore() {
        storeGeneric.forEach(observer -> observer.update(this.shipping));
    }

    public void removeByName(String name){
        this.removeStore(storeGeneric.stream()
                .filter(observer -> observer instanceof Store && ((Store) observer).getNameStore().equals(name))
                .findFirst()
                .get());
    }
}