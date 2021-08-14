package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Servers;
import ekonsoft.cmd.entities.dtos.ServersDto;

import java.util.List;

public interface ServerService {

    Result add(ServersDto serversDto);
    Result update(Servers servers);
    Result delete(int id);
    DataResult<Servers> getById(int id);
    DataResult<List<Servers>> getAll();

}
