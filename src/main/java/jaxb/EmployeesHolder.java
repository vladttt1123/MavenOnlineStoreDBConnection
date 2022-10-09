package jaxb;

import persistence.models.Employees;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "list-employees")
public class EmployeesHolder {

    private List<Employees> employees = new ArrayList<Employees>();

    public EmployeesHolder(){

    }

    public EmployeesHolder(List <Employees> employees){
        this.employees = employees;
    }


    public List<Employees> getEmployees(){
        return employees;
    }

    @XmlElement(name = "employee", type = Employees.class)
    public void setEmployees(List<Employees>employees){
        this.employees = employees;
    }


}
