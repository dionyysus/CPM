package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.MailDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.MailDetails;
import ekonsoft.cmd.entities.dtos.MailDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mailDetail")
@CrossOrigin
public class MailDetailsController {

    private MailDetailService mailDetailService;

    @Autowired
    public MailDetailsController(MailDetailService mailDetailService) {
        this.mailDetailService = mailDetailService;
    }

    @GetMapping("/getall")
    public DataResult<List<MailDetails>> getAll(){
        return this.mailDetailService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody MailDetailsDto mailDetailsDto){
        return this.mailDetailService.add(mailDetailsDto);
    }

    @PostMapping("/update")
    public Result update(@RequestBody MailDetailsDto mailDetailsDto, int id){
        return this.mailDetailService.update(mailDetailsDto,id);
    }
    @GetMapping("getByProjectDetailsId")
    public DataResult<List<MailDetails>> getByProjectDetailsId(@RequestParam int id){
        return this.mailDetailService.getByProjectDetailsId(id);
    }

}
