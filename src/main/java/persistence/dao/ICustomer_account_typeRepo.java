package persistence.dao;

import persistence.models.Customer_account_type;

import java.sql.SQLException;
import java.util.List;

public interface ICustomer_account_typeRepo {

    //get by id
    Customer_account_type findById(int id);


    //read
    List<Customer_account_type> findAll();




//    //create
//    void add(Customer_account_type customer_account_type);
//
//
//
//
//
//    //update
//    void update(Customer_account_type customer_account_type);
//
//    //delete
//    void delete(Customer_account_type customer_account_type) throws SQLException;
}
