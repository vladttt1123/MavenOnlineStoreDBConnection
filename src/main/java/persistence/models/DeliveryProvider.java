package persistence.models;

public class DeliveryProvider {
    private int iddeliveryProvider;
    private String name;
    private double weight;
    private int orders_idorders;

    public DeliveryProvider(int iddeliveryProvider, String name, double weight, int orders_idorders) {
        this.iddeliveryProvider = iddeliveryProvider;
        this.name = name;
        this.weight = weight;
        this.orders_idorders = orders_idorders;
    }
    public DeliveryProvider(){

    };

    public int getIddeliveryProvider() {
        return iddeliveryProvider;
    }

    public void setIddeliveryProvider(int iddeliveryProvider) {
        this.iddeliveryProvider = iddeliveryProvider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getOrders_idorders() {
        return orders_idorders;
    }

    public void setOrders_idorders(int orders_idorders) {
        this.orders_idorders = orders_idorders;
    }

    @Override
    public String toString() {
        return "DeliveryProvider{" +
                "iddeliveryProvider=" + iddeliveryProvider +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", orders_idorders=" + orders_idorders +
                '}';
    }
}
