package persistence.models;

public class Transactions {

    private int idtransactions;
    private int customerId;
    private int orderId;
    private String productName;
    private int stores_id;


    public Transactions(int idtransactions, int customerId, int orderId, String productName, int stores_id) {
        this.idtransactions = idtransactions;
        this.customerId = customerId;
        this.orderId = orderId;
        this.productName = productName;
        this.stores_id = stores_id;
    }

    public Transactions(){

    };

    public int getIdtransactions() {
        return idtransactions;
    }

    public void setIdtransactions(int idtransactions) {
        this.idtransactions = idtransactions;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStores_id() {
        return stores_id;
    }

    public void setStores_id(int stores_id) {
        this.stores_id = stores_id;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "idtransactions=" + idtransactions +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", stores_id=" + stores_id +
                '}';
    }
}
