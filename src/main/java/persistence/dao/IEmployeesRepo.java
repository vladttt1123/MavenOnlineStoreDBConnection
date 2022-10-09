package persistence.dao;


import persistence.models.Employees;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeesRepo {

    //read
    Employees findById(int idemployee) throws SQLException;

    List<Employees> findAll() throws SQLException;
    

    //create
    void createEmployee(Employees employee) throws SQLException;


   //update
    void updateEmployees(Employees employees) throws SQLException;

    //delete
    void deleteById(Integer id) throws SQLException;




}
