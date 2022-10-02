package persistence.models;

import java.util.Date;
// anakyze all connections in database

public class Orders {
    private int idorders;
    private Date date;
    private int transactions_id;
    private int customers_id;


    public Orders(int idorders, Date date, int transactions_id, int customers_id) {
        this.idorders = idorders;
        this.date = date;
        this.transactions_id = transactions_id;
        this.customers_id = customers_id;
    }
    public Orders(){

    };



    public int getIdorders() {
        return idorders;
    }

    public void setIdorders(int idorders) {
        this.idorders = idorders;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTransactions_id() {
        return transactions_id;
    }

    public void setTransactions_id(int transactions_id) {
        this.transactions_id = transactions_id;
    }

    public int getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(int customers_id) {
        this.customers_id = customers_id;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "idorders=" + idorders +
                ", date=" + date +
                ", transactions_id=" + transactions_id +
                ", customers_id=" + customers_id +
                '}';
    }
}

