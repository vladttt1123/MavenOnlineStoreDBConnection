package persistence.dao;

import persistence.models.Salaries;
import persistence.models.Stores;

import java.util.List;

public interface IStoresRepo {
    IStoresRepo findById(int idstore);


    List<Stores> findAll();
}
