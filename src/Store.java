public class Store implements StoreGeneric {
    private final String nameStore;

    public Store(String nameStore) {
        this.nameStore = nameStore;
    }

    @Override
    public void update(String order) {
        System.out.println(nameStore + ": Ha llegado una nueva solicitud de un cliente que requiere: " + order);
    }

    public String getNameStore() {
        return nameStore;
    }

    @Override
    public String toString() {
        return "Store {" +
                "name='" + nameStore + '\'' +
                '}';
    }
}
