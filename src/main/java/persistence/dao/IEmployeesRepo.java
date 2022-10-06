package persistence.dao;


import persistence.models.Employees;

import java.util.List;

public interface IEmployeesRepo {

    //read
    IEmployeesRepo findById(int idemployee);

    List<Employees> findAll();
    

    //create
    void createEmployee(Employees employee);


   //update
    void updateEmployees(Employees employees);

    //delete
    void deleteById(Integer id);




}
