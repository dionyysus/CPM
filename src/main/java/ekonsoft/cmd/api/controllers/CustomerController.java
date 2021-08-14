package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.CustomerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.dtos.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer/")
@CrossOrigin
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Customers>> getAll(){
        return this.customerService.getAll();
    }

    @PostMapping("/add/{id}")
    public Result add(@RequestBody CustomerDto customerDto){
        return this.customerService.add(customerDto);
    }
}
