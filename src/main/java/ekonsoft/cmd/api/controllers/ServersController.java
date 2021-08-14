package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.ServerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Servers;
import ekonsoft.cmd.entities.dtos.CustomerDto;
import ekonsoft.cmd.entities.dtos.ServersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/server/")
@CrossOrigin
public class ServersController {

    private ServerService serverService;

    @Autowired
    public ServersController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/getall")
    public DataResult<List<Servers>> getAll(){
        return this.serverService.getAll();
    }

    @PostMapping("/add/{id}")
    public Result add(@RequestBody ServersDto serversDto){
        return this.serverService.add(serversDto);
    }
}
