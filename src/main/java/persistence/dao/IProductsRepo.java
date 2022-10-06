package persistence.dao;

import persistence.models.Customers;
import persistence.models.Products;

import java.util.List;

public interface IProductsRepo {

    IProductsRepo findById(int idproducts);


    List<Products> findAll();
}
