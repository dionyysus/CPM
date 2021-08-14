package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.MailDetailService;
import ekonsoft.cmd.business.abstracts.RelatedPersonService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.RelatedPersonsDao;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import ekonsoft.cmd.entities.dtos.RelatedPersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelatedPersonManager implements RelatedPersonService {

    private RelatedPersonsDao relatedPersonsDao;

    @Autowired
    public RelatedPersonManager(RelatedPersonsDao relatedPersonsDao) {
        this.relatedPersonsDao = relatedPersonsDao;
    }

    @Override
    public Result add(RelatedPersonDto relatedPersonDto) {

        RelatedPersons relatedPersons = new RelatedPersons();
        relatedPersons.setProjectDetails(this.relatedPersonsDao.findById(relatedPersonDto.getId()).get().getProjectDetails());
        relatedPersons.setName(relatedPersonDto.getName());
        relatedPersons.setPhone(relatedPersonDto.getPhone());

        this.relatedPersonsDao.save(relatedPersons);
        return new SuccessResult("Related person added");
    }

    @Override
    public Result update(RelatedPersons relatedPersons) {
        this.relatedPersonsDao.save(relatedPersons);
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
}
