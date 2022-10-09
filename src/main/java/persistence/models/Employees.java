package persistence.models;

import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "employees")
@XmlType (propOrder = {"idemployee","firstName","lastName","storeId","salaries_idsalary" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

    @XmlAttribute
    @JsonProperty
    private int idemployee;

    @XmlElement(name ="firstName")
    @JsonProperty
    private String firstName;

    @XmlElement (name = "lastName")
    @JsonProperty
    private String lastName;

    @XmlElement (name = "storeId")
    @JsonProperty
    private int storeId;

    @XmlElement (name = "salaries_idsalary")
    @JsonProperty
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
