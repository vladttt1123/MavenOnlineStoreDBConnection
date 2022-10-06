package persistence.dao;

import persistence.models.Employees;
import persistence.models.Orders;

import java.util.List;

public interface IOrdersRepo {


    IOrdersRepo findById(int idorders);


    List<Orders> findAll();
}
