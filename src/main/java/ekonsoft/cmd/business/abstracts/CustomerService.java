package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;

public interface CustomerService {

    Result add(Customers customers);
    DataResult<Customers> getById(int id);

}
