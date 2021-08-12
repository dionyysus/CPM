package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Domains;

import java.util.List;

public interface DomainService {

    Result add(Domains domains);
    Result update(Domains domains);
    Result delete(int id);
    DataResult<Domains> getById(int id);
    DataResult<List<Domains>> getAll();

}
