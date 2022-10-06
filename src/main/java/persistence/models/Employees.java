package persistence.models;

public class Employees {
    private int idemployee;
    private String firstName;
    private String lastName;
    private int storeId;
    private int salaries_idsalary;


    public Employees(int idemployee, String firstName, String lastName, int storeId, int salaries_idsalary) {
        this.idemployee = idemployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.storeId = storeId;
        this.salaries_idsalary = salaries_idsalary;
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

    public int getSalaries_idsalary() {
        return salaries_idsalary;
    }

    public void setSalaries_idsalary(int salaries_idsalary) {
        this.salaries_idsalary = salaries_idsalary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "idemployee=" + idemployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", storeId=" + storeId +
                ", salaries_id=" + salaries_idsalary +
                '}';
    }
}
