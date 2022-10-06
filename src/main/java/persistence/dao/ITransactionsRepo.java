package persistence.dao;

import persistence.models.Salaries;
import persistence.models.Transactions;

import java.util.List;

public interface ITransactionsRepo {


    ITransactionsRepo findById(int idtransactions);
    List<Transactions> findAll();
}
