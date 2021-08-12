package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.CustomerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;

public class CustomerManager implements CustomerService {
    @Override
    public Result add(Customers customers) {
        return null;
    }

    @Override
    public DataResult<Customers> getById(int id) {
        return null;
    }
}
