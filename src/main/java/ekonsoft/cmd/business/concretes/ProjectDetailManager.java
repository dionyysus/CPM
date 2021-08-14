package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.CustomersDao;
import ekonsoft.cmd.dataAccess.abstracts.ProjectDetailsDao;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.ProjectDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailManager implements ProjectDetailService {

     ProjectDetailsDao projectDetailsDao;
     CustomersDao customersDao;

     @Autowired
    public ProjectDetailManager(ProjectDetailsDao projectDetailsDao, CustomersDao customersDao) {
        this.projectDetailsDao = projectDetailsDao;
        this.customersDao = customersDao;
    }

    @Override
    public Result add(int customerId) {

        ProjectDetails projectDetails = new ProjectDetails();
        projectDetails.setCustomers(this.customersDao.getById(customerId));

        this.projectDetailsDao.save(projectDetails);

        return new SuccessResult("Project Detail saved");

    }

    @Override
    public Result update(ProjectDetails projectDetails) {
        this.projectDetailsDao.save(projectDetails);
        return new SuccessResult("Project updated");
    }

    @Override
    public Result delete(int id) {
        this.projectDetailsDao.deleteById(id);
        return new SuccessResult("Project deleted");
    }

    @Override
    public DataResult<ProjectDetails> getById(int id) {
        return new SuccessDataResult<ProjectDetails>(this.projectDetailsDao.getById(id));
    }

    @Override
    public DataResult<List<ProjectDetails>> getAll() {
        return new SuccessDataResult<List<ProjectDetails>>(this.projectDetailsDao.findAll());
    }
}
