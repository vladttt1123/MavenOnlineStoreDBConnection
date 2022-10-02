package persistence.models;

import java.sql.Date;

public class Customer_account_type {
    private int idcustomer_account_type;
    private String account_type;
    private Date customer_account_typecol;

    public Customer_account_type(int idcustomer_account_type, String account_type, Date customer_account_typecol) {
        this.idcustomer_account_type = idcustomer_account_type;
        this.account_type = account_type;
        this.customer_account_typecol = customer_account_typecol;
    }

    public Customer_account_type(){

    };

    public int getIdcustomer_account_type() {
        return idcustomer_account_type;
    }

    public void setIdcustomer_account_type(int idcustomer_account_type) {
        this.idcustomer_account_type = idcustomer_account_type;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public Date getCustomer_account_typecol() {
        return customer_account_typecol;
    }

    public void setCustomer_account_typecol(Date customer_account_typecol) {
        this.customer_account_typecol = customer_account_typecol;
    }

    @Override
    public String toString() {
        return "Customer_account_type{" +
                "idcustomer_account_type=" + idcustomer_account_type +
                ", account_type='" + account_type + '\'' +

                '}';
    }
}
