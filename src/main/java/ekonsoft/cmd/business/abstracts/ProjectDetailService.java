package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.ProjectDetailsDto;
import ekonsoft.cmd.entities.dtos.ProjectDetailsListDto;

import java.util.List;

public interface ProjectDetailService {

    Result add(ProjectDetailsDto projectDetailsDto);

    Result update(ProjectDetailsDto projectDetailsDto,int id);
    Result delete(int id);

    DataResult<ProjectDetails> getById(int id);

    DataResult<List<ProjectDetails>> getAll();

    DataResult<ProjectDetailsListDto> getProjectDetails(int id);

    Result changeActiveToPassive(int id);


}
