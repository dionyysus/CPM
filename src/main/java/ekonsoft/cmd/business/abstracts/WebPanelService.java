package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.WebPanels;
import ekonsoft.cmd.entities.dtos.WebPanelsDto;

import java.util.List;

public interface WebPanelService {

    Result add(WebPanelsDto webPanelsDto);
    Result update(WebPanelsDto webPanelsDto, int id);
    Result delete(int id);
    DataResult<WebPanels> getById(int id);
    DataResult<List<WebPanels>> getAll();
    DataResult<List<WebPanels>>getByProjectDetailsId(int id);

}
