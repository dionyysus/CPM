package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.MailDetailService;
import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.MailDetailsDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.MailDetails;
import ekonsoft.cmd.entities.dtos.MailDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailDetailManager implements MailDetailService {

    private MailDetailsDao mailDetailsDao;
    private ProjectDetailService projectDetailService;

    @Autowired
    public MailDetailManager(MailDetailsDao mailDetailsDao, ProjectDetailService projectDetailService) {
        this.mailDetailsDao = mailDetailsDao;
        this.projectDetailService = projectDetailService;
    }

    @Override
    public Result add(MailDetailsDto mailDetailsDto) {

        MailDetails mailDetails = new MailDetails();
        mailDetails.setProjectDetails(projectDetailService.getById(mailDetailsDto.getId()).getData());
        mailDetails.setAddress(mailDetailsDto.getAddress());
        mailDetails.setDescription(mailDetailsDto.getDescription());
        mailDetailsDto.setServerRegistration(mailDetailsDto.getServerRegistration());
        mailDetailsDto.setPassword(mailDetailsDto.getPassword());
        this.mailDetailsDao.save(mailDetails);
        return new SuccessResult("Mail added");
    }

    @Override
    public Result delete(int id) {
        this.mailDetailsDao.deleteById(id);
        return new SuccessResult("Mail deleted");
    }

    @Override
    public Result update(MailDetailsDto mailDetailsDto, int id) {

        MailDetails mailDetails = mailDetailsDao.getById(id);

        mailDetails.setAddress(mailDetailsDto.getAddress());
        mailDetails.setPassword(mailDetailsDto.getPassword());
        mailDetails.setDescription(mailDetailsDto.getDescription());
        mailDetails.setServerRegistration(mailDetailsDto.getServerRegistration());

        mailDetailsDao.save(mailDetails);
        return new SuccessResult("Mail details updated");
    }

    @Override
    public DataResult<MailDetails> getById(int id) {
        return new SuccessDataResult<MailDetails>(this.mailDetailsDao.getById(id));
    }

    @Override
    public DataResult<List<MailDetails>> getAll() {
        return new SuccessDataResult<List<MailDetails>>(this.mailDetailsDao.findAll());
    }

    @Override
    public DataResult<List<MailDetails>> getByProjectDetailsId(int id) {
        return new SuccessDataResult<List<MailDetails>>(this.mailDetailsDao.getByProjectDetailsId(id));
    }
}
