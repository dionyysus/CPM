package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.DomainService;
import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.DomainsDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Domains;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.DomainDto;
import ekonsoft.cmd.entities.dtos.ProjectDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomainManager implements DomainService {

    private DomainsDao domainsDao;
    private ProjectDetailService projectDetailService;

    @Autowired
    public DomainManager(DomainsDao domainsDao, ProjectDetailService projectDetailService) {
        this.domainsDao = domainsDao;
        this.projectDetailService = projectDetailService;
    }

    @Override
    public Result add(DomainDto domainDto) {

        Domains domains = new Domains();
        domains.setProjectDetails(projectDetailService.getById(domainDto.getId()).getData());
        domains.setDomainRegistration(domainDto.getDomainRegistration());

        this.domainsDao.save(domains);
        return new SuccessResult("Domain added");
    }

    @Override
    public Result update(DomainDto domainDto, int id) {
        Domains domains = domainsDao.getById(id);

        domains.setDomainRegistration(domainDto.getDomainRegistration());

        domainsDao.save(domains);
        return new SuccessResult("Domain updated");
    }

    @Override
    public Result delete(int id) {
        this.domainsDao.deleteById(id);
        return new SuccessResult("Domain deleted");
    }


    @Override
    public DataResult<Domains> getById(int id) {
        return new SuccessDataResult<Domains>(this.domainsDao.getById(id));
    }

    @Override
    public DataResult<List<Domains>> getAll() {
        return new SuccessDataResult<List<Domains>>(this.domainsDao.findAll());
    }

    @Override
    public DataResult<List<Domains>> getByProjectDetailsId(int id) {
        return new SuccessDataResult<List<Domains>>(this.domainsDao.getByProjectDetailsId(id));
    }
}
