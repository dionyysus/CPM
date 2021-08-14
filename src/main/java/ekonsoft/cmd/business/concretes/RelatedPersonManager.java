package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.MailDetailService;
import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.business.abstracts.RelatedPersonService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.RelatedPersonsDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import ekonsoft.cmd.entities.dtos.RelatedPersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatedPersonManager implements RelatedPersonService {

    private RelatedPersonsDao relatedPersonsDao;
    private ProjectDetailService projectDetailService;

    @Autowired
    public RelatedPersonManager(RelatedPersonsDao relatedPersonsDao, ProjectDetailService projectDetailService) {
        this.relatedPersonsDao = relatedPersonsDao;
        this.projectDetailService = projectDetailService;
    }

    @Override
    public Result add(RelatedPersonDto relatedPersonDto) {

        RelatedPersons relatedPersons = new RelatedPersons();
        relatedPersons.setProjectDetails(projectDetailService.getById(relatedPersonDto.getId()).getData());

        relatedPersons.setName(relatedPersonDto.getName());
        relatedPersons.setPhone(relatedPersonDto.getPhone());

        this.relatedPersonsDao.save(relatedPersons);
        return new SuccessResult("Related person added");
    }

    @Override
    public Result update(RelatedPersonDto relatedPersonDto, int id) {

        RelatedPersons relatedPersons = relatedPersonsDao.getById(id);

        relatedPersons.setName(relatedPersonDto.getName());
        relatedPersons.setPhone(relatedPersonDto.getPhone());

        relatedPersonsDao.save(relatedPersons);
        return new SuccessResult("Related person updated");
    }


    @Override
    public Result delete(int id) {
        this.relatedPersonsDao.deleteById(id);
        return new SuccessResult("Related person deleted");
    }

    @Override
    public DataResult<RelatedPersons> getById(int id) {
        return new SuccessDataResult<RelatedPersons>(this.relatedPersonsDao.getById(id));
    }

    @Override
    public DataResult<List<RelatedPersons>> getAll() {
        return new SuccessDataResult<List<RelatedPersons>>(this.relatedPersonsDao.findAll());
    }

    @Override
    public DataResult<List<RelatedPersons>> getByProjectDetailsId(int id) {
        return new SuccessDataResult<List<RelatedPersons>>(this.relatedPersonsDao.getByProjectDetailsId(id));
    }
}
