package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Domains;

public interface DomainService {

    Result add(Domains domains);
    DataResult<Domains> getById(int id);

}
