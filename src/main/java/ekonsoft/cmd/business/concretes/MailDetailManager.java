package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.MailDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.MailDetailsDao;
import ekonsoft.cmd.entities.concretes.MailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailDetailManager implements MailDetailService {

    private MailDetailsDao mailDetailsDao;

    @Autowired
    public MailDetailManager(MailDetailsDao mailDetailsDao) {
        this.mailDetailsDao = mailDetailsDao;
    }


    @Override
    public Result add(MailDetails mailDetails) {
        this.mailDetailsDao.save(mailDetails);
        return new SuccessResult("Mail added");
    }

    @Override
    public Result delete(int id) {
        this.mailDetailsDao.deleteById(id);
        return new SuccessResult("Mail deleted");
    }

    @Override
    public Result update(MailDetails mailDetails) {
        this.mailDetailsDao.save(mailDetails);
        return new SuccessResult("Mail updated");
    }

    @Override
    public DataResult<MailDetails> getById(int id) {
        return new SuccessDataResult<MailDetails>(this.mailDetailsDao.getById(id));
    }

    @Override
    public DataResult<List<MailDetails>> getAll() {
        return new SuccessDataResult<List<MailDetails>>(this.mailDetailsDao.findAll());
    }
}
