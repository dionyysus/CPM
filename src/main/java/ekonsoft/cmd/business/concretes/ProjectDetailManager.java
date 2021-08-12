package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.ProjectDetailsDao;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailManager implements ProjectDetailService {

    private ProjectDetailsDao projectDetailsDao;

    @Autowired
    public ProjectDetailManager(ProjectDetailsDao projectDetailsDao) {
        this.projectDetailsDao = projectDetailsDao;
    }

    @Override
    public Result add(ProjectDetails projectDetails) {
        this.projectDetailsDao.save(projectDetails);
        return new SuccessResult("Project added");
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
