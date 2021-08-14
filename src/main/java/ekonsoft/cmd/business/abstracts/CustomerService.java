package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.dtos.CustomerDto;

import java.util.List;

public interface CustomerService {

    Result add(CustomerDto customerDto);
    Result delete(int id);
    Result update(CustomerDto customerDto, int id);
    DataResult<Customers> getById(int id);
    DataResult<List<Customers>> getAll();
    DataResult<List<Customers>>getByProjectDetailsId(int id);
}
