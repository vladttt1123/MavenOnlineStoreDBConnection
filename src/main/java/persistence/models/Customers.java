package persistence.models;

public class Customers {

    private int idcustomers;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private int customer_account_type_idcustomer_account_type;


    public Customers(int idcustomers, String firstName, String lastName, String phoneNumber, String city, int customer_account_type_idcustomer_account_type) {
        this.idcustomers = idcustomers;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.customer_account_type_idcustomer_account_type = customer_account_type_idcustomer_account_type;
    }

    public Customers(){

    };

    public int getIdcustomers() {
        return idcustomers;
    }

    public void setIdcustomers(int idcustomers) {
        this.idcustomers = idcustomers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCustomer_account_type_idcustomer_account_type() {
        return customer_account_type_idcustomer_account_type;
    }

    public void setCustomer_account_type_idcustomer_account_type(int customer_account_type_idcustomer_account_type) {
        this.customer_account_type_idcustomer_account_type = customer_account_type_idcustomer_account_type;
    }

    @Override
    public String toString() {
        return "Сustomers{" +
                "idcustomers=" + idcustomers +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", customer_account_type=" + customer_account_type_idcustomer_account_type +
                '}';
    }
}
