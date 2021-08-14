package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.RelatedPersonService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import ekonsoft.cmd.entities.dtos.CustomerDto;
import ekonsoft.cmd.entities.dtos.RelatedPersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relatedPerson")
@CrossOrigin
public class RelatedPersonsController {

    private RelatedPersonService relatedPersonService;

    @Autowired
    public RelatedPersonsController(RelatedPersonService relatedPersonService) {
        this.relatedPersonService = relatedPersonService;
    }

    @GetMapping("/getall")
    public DataResult<List<RelatedPersons>> getAll(){
        return this.relatedPersonService.getAll();
    }

    @PostMapping("/add/{id}")
    public Result add(@RequestBody RelatedPersonDto relatedPersonDto){
        return this.relatedPersonService.add(relatedPersonDto);
    }
}
