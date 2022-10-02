package persistence.dao;

import persistence.models.Customer_account_type;
import persistence.models.Сustomers;

import java.sql.SQLException;
import java.util.List;

public interface ICustomersRepo {
    //get by id
    Сustomers findById(int id);


    //read
    List<Сustomers> findAll();



//    //update
//    void update(Customer_account_type customer_account_type);
//
//    //delete
//    void delete(Customer_account_type customer_account_type) throws SQLException;
}
