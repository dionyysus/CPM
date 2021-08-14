package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.DomainService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Domains;
import ekonsoft.cmd.entities.dtos.DomainDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/domain")
@CrossOrigin
public class DomainController {

    private DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping("/getall")
    public DataResult<List<Domains>> getAll(){
        return this.domainService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody DomainDto domainDto){
        return this.domainService.add(domainDto);
    }
}
