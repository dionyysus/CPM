package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.WebPanels;
import ekonsoft.cmd.entities.dtos.WebPanelsDto;

import java.util.List;

public interface WebPanelService {

    Result add(WebPanelsDto webPanelsDto);
    Result update(WebPanels webPanels);
    Result delete(int id);
    DataResult<WebPanels> getById(int id);
    DataResult<List<WebPanels>> getAll();

}
