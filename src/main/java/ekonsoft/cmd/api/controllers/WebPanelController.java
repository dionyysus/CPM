package ekonsoft.cmd.api.controllers;

import ekonsoft.cmd.business.abstracts.WebPanelService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.WebPanels;
import ekonsoft.cmd.entities.dtos.WebPanelsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/webPanel")
@CrossOrigin
public class WebPanelController {

    private WebPanelService webPanelService;

    @Autowired
    public WebPanelController(WebPanelService webPanelService) {
        this.webPanelService = webPanelService;
    }
    @GetMapping("/getall")
    public DataResult<List<WebPanels>> getAll(){
        return this.webPanelService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody WebPanelsDto webPanelsDto){
        return this.webPanelService.add(webPanelsDto);
    }

    @PostMapping("/update")
    public Result update(@RequestBody WebPanelsDto webPanelsDto, int id){
        return this.webPanelService.update(webPanelsDto,id);
    }

    @GetMapping("getByProjectDetailsId")
    public DataResult<List<WebPanels>> getByProjectDetailsId(@RequestParam int id){
        return this.webPanelService.getByProjectDetailsId(id);
    }

}
