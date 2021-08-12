package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.ProjectDetails;

import java.util.List;

public interface ProjectDetailService {

    Result add(ProjectDetails projectDetails);
    Result update(ProjectDetails projectDetails);
    Result delete(int id);
    DataResult<ProjectDetails> getById(int id);
    DataResult<List<ProjectDetails>> getAll();
}
