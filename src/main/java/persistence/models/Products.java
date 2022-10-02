package persistence.models;

public class Products {

    private int inproducts;
    private String name;
    private double price;
    private String category;
    private int orders_idorders;


    public Products(int inproducts, String name, double price, String category, int orders_idorders) {
        this.inproducts = inproducts;
        this.name = name;
        this.price = price;
        this.category = category;
        this.orders_idorders = orders_idorders;
    }

    public Products(){

    };

    public int getInproducts() {
        return inproducts;
    }

    public void setInproducts(int inproducts) {
        this.inproducts = inproducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getOrders_idorders() {
        return orders_idorders;
    }

    public void setOrders_idorders(int orders_idorders) {
        this.orders_idorders = orders_idorders;
    }

    @Override
    public String toString() {
        return "Products{" +
                "inproducts=" + inproducts +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", orders_idorders=" + orders_idorders +
                '}';
    }
}
