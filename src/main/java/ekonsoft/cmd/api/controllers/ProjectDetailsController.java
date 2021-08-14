package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import ekonsoft.cmd.entities.dtos.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projectController")
@CrossOrigin
public class ProjectDetailsController {

    private ProjectDetailService projectDetailService;

    @Autowired
    public ProjectDetailsController(ProjectDetailService projectDetailService) {
        this.projectDetailService = projectDetailService;
    }

    @GetMapping("/getall")
    public DataResult<List<ProjectDetails>> getAll(){
        return this.projectDetailService.getAll();
    }

}
