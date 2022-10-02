package persistence.models;

public class Employees {
    private int idemployee;
    private String firstName;
    private String lastName;
    private int storeId;
    private int salaries_id;


    public Employees(int idemployee, String firstName, String lastName, int storeId, int salaries_id) {
        this.idemployee = idemployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.storeId = storeId;
        this.salaries_id = salaries_id;
    }
    public Employees(){

    };

    public int getIdemployee() {
        return idemployee;
    }

    public void setIdemployee(int idemployee) {
        this.idemployee = idemployee;
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

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getSalaries_id() {
        return salaries_id;
    }

    public void setSalaries_id(int salaries_id) {
        this.salaries_id = salaries_id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "idemployee=" + idemployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", storeId=" + storeId +
                ", salaries_id=" + salaries_id +
                '}';
    }
}
