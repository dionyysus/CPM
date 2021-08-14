package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.business.abstracts.ServerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.ServersDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Servers;
import ekonsoft.cmd.entities.dtos.ServersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerManager implements ServerService {

    private ServersDao serversDao;
    private ProjectDetailService projectDetailService;

    @Autowired
    public ServerManager(ServersDao serversDao, ProjectDetailService projectDetailService) {
        this.serversDao = serversDao;
        this.projectDetailService = projectDetailService;
    }

    @Override
    public Result add(ServersDto serversDto) {

        Servers servers = new Servers();
        servers.setProjectDetails(projectDetailService.getById(serversDto.getId()).getData());
        servers.setAddress(serversDto.getAddress());
        servers.setName(serversDto.getName());
        servers.setIp(serversDto.getIp());
        servers.setPanelAdress(serversDto.getPanelAdress());
        servers.setPassword(serversDto.getPassword());
        servers.setRegistration(serversDto.getRegistration());

        this.serversDao.save(servers);
        return new SuccessResult("Server added");
    }

    @Override
    public Result update(ServersDto serversDto, int id) {

        Servers servers  = serversDao.getById(id);

        servers.setAddress(serversDto.getAddress());
        servers.setName(serversDto.getName());
        servers.setIp(serversDto.getIp());
        servers.setPanelAdress(serversDto.getPanelAdress());
        servers.setPassword(serversDto.getPassword());
        servers.setRegistration(serversDto.getRegistration());
        serversDao.save(servers);
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

    @Override
    public DataResult<List<Servers>> getByProjectDetailsId(int id) {
        return new SuccessDataResult<List<Servers>>(this.serversDao.getByProjectDetailsId(id));
    }
}
