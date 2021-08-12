package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;

import java.util.List;

public interface CustomerService {

    Result add(Customers customers);
    Result delete(int id);
    Result update(Customers customers);
    DataResult<Customers> getById(int id);
    DataResult<List<Customers>> getAll();
}
