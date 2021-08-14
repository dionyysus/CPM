package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Domains;
import ekonsoft.cmd.entities.dtos.DomainDto;

import java.util.List;

public interface DomainService {

    Result add(DomainDto domainDto);
    Result update(DomainDto domainDto, int id);
    Result delete(int id);
    DataResult<Domains> getById(int id);
    DataResult<List<Domains>> getAll();
    DataResult<List<Domains>>getByProjectDetailsId(int id);

}
