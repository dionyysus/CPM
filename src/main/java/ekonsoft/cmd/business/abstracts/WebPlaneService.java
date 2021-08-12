package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.WebPanels;

import java.util.List;

public interface WebPlaneService {

    Result add(WebPanels webPanels);
    Result update(WebPanels webPanels);
    Result delete(int id);
    DataResult<WebPanels> getById(int id);
    DataResult<List<WebPanels>> getAll();

}
