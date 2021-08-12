package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.ServerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.ServersDao;
import ekonsoft.cmd.entities.concretes.Servers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerManager implements ServerService {

    private ServersDao serversDao;

    @Autowired
    public ServerManager(ServersDao serversDao) {
        this.serversDao = serversDao;
    }

    @Override
    public Result add(Servers servers) {
        this.serversDao.save(servers);
        return new SuccessResult("Server added");
    }

    @Override
    public Result update(Servers servers) {
        this.serversDao.save(servers);
        return new SuccessResult("Server updated");
    }

    @Override
    public Result delete(int id) {
        this.serversDao.deleteById(id);
        return new SuccessResult("Server deleted");
    }

    @Override
    public DataResult<Servers> getById(int id) {
        return new SuccessDataResult<Servers>(this.serversDao.getById(id));
    }

    @Override
    public DataResult<List<Servers>> getAll() {
        return new SuccessDataResult<List<Servers>>(this.serversDao.findAll());
    }
}
