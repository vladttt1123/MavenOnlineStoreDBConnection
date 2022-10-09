package persistence.dao;

import persistence.models.Salaries;

import java.util.List;

public interface ISalariesRepo {

    Salaries findById(int idsalary);

    List<Salaries> findAll();
}
