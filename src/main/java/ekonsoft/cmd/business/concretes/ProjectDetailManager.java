package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.CustomerService;
import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.CustomersDao;
import ekonsoft.cmd.dataAccess.abstracts.ProjectDetailsDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.ProjectDetailsDto;
import ekonsoft.cmd.entities.dtos.ProjectDetailsListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailManager implements ProjectDetailService {

     ProjectDetailsDao projectDetailsDao;

    @Autowired
    public ProjectDetailManager(ProjectDetailsDao projectDetailsDao) {
        this.projectDetailsDao = projectDetailsDao;

    }

    @Override
    public Result add(ProjectDetailsDto projectDetailsDto) {

        ProjectDetails projectDetails = new ProjectDetails();
        projectDetails.setName(projectDetailsDto.getName());
        projectDetails.setDescription(projectDetailsDto.getDescription());
        projectDetails.setPlatforms(projectDetailsDto.getPlatforms());
        projectDetails.setDeadline(projectDetailsDto.getDeadline());
        projectDetails.setTecnologies(projectDetailsDto.getTecnologies());
        projectDetails.setInfo(projectDetailsDto.getInfo());
        projectDetails.setServers(projectDetailsDto.);
        this.projectDetailsDao.save(projectDetails);
        return new SuccessResult("Project Detail saved");
    }

    @Override
    public Result update(ProjectDetailsDto projectDetailsDto,int id) {
       ProjectDetails projectDetails = projectDetailsDao.getById(id);
       projectDetails.setInfo(projectDetailsDto.getInfo());
       projectDetails.setName(projectDetailsDto.getName());
       projectDetails.setDescription(projectDetailsDto.getDescription());
       projectDetails.setDeadline(projectDetailsDto.getDeadline());
       projectDetails.setTecnologies(projectDetailsDto.getTecnologies());
       projectDetails.setPlatforms(projectDetailsDto.getPlatforms());

       projectDetailsDao.save(projectDetails);
       return new SuccessResult();
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

    @Override
    public DataResult<ProjectDetailsListDto> getProjectDetails(int id) {

        ProjectDetails getProject = projectDetailsDao.getById(id);
        ProjectDetailsListDto getAllData = new ProjectDetailsListDto();
        getAllData.setCustomers(getProject.getCustomers());
        getAllData.setName(getProject.getName());
        getAllData.setDeadline(getProject.getDeadline());
        getAllData.setDescription(getProject.getDescription());
        getAllData.setInfo(getProject.getInfo());
        getAllData.setPlatforms(getProject.getPlatforms());
        getAllData.setTecnologies(getProject.getTecnologies());
        getAllData.setMailDetails(getProject.getMailDetails());
        getAllData.setRelatedPersons(getProject.getRelatedPersons());
        getAllData.setDomains(getProject.getDomains());

        return new SuccessDataResult<ProjectDetailsListDto>(getAllData);

    }

    @Override
    public Result changeActiveToPassive(int id) {
        ProjectDetails projectDetails = getById(id).getData();
        /*ProjectDetailsDto projectDetailsDto = new ProjectDetailsDto();
        projectDetailsDto.setActive(false);*/
        projectDetails.setActive(false);
        projectDetailsDao.save(projectDetails);
        //update(projectDetailsDto);    private boolean isActive;
        return new SuccessResult();
    }




}
