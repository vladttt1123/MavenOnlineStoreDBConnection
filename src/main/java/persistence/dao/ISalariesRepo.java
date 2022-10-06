package persistence.dao;

import persistence.models.Customers;
import persistence.models.Salaries;

import java.util.List;

public interface ISalariesRepo {

    ISalariesRepo findById(int idsalary);

    List<Salaries> findAll();
}
