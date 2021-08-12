package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.WebPanels;

public interface WebPlaneService {

    Result add(WebPanels webPanels);
    DataResult<WebPanels> getById(int id);
}
