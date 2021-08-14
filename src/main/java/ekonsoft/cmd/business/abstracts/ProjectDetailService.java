package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.ProjectDetailsDto;

import java.util.List;

public interface ProjectDetailService {

    Result add(int customerId);
    Result update(ProjectDetails projectDetails);
    Result delete(int id);
    DataResult<ProjectDetails> getById(int id);
    DataResult<List<ProjectDetails>> getAll();
}
