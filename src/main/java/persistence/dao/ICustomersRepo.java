package persistence.dao;

import persistence.models.Customers;

import java.util.List;

public interface ICustomersRepo {
    //get by id
    //read
    Customers findById(int id);


    //read
    List<Customers> findAll();

    //create
    void createCustomer(Customers customer);

    //update
    void updateCustomer(Customers customer);

    //delete
    void deleteById(Integer id);




//    //update
//    void update(Customer_account_type customer_account_type);
//
//    //delete
//    void delete(Customer_account_type customer_account_type) throws SQLException;
}
