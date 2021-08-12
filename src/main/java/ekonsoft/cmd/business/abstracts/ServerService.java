package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Servers;

public interface ServerService {

    Result add(Servers servers);
    DataResult<Servers> getById(int id);
}
