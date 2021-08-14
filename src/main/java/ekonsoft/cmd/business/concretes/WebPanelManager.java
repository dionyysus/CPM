package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.WebPanelService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.WebPanelsDao;
import ekonsoft.cmd.entities.concretes.WebPanels;
import ekonsoft.cmd.entities.dtos.WebPanelsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebPanelManager implements WebPanelService {

    private WebPanelsDao webPanelsDao;

    @Autowired
    public WebPanelManager(WebPanelsDao webPanelsDao) {
        this.webPanelsDao = webPanelsDao;
    }

    @Override
    public Result add(WebPanelsDto webPanelsDto) {

        WebPanels webPanels = new WebPanels();
        webPanels.setProjectDetails(this.webPanelsDao.findById(webPanelsDto.getId()).get().getProjectDetails());
        webPanels.setPassword(webPanelsDto.getPassword());
        webPanels.setUsername(webPanelsDto.getUsername());

        this.webPanelsDao.save(webPanels);
        return new SuccessResult("Web panel added");
    }

    @Override
    public Result update(WebPanels webPanels) {
        this.webPanelsDao.save(webPanels);
        return new SuccessResult("Web panel updated");
    }

    @Override
    public Result delete(int id) {
        this.webPanelsDao.deleteById(id);
        return new SuccessResult("Web panel deleted");
    }

    @Override
    public DataResult<WebPanels> getById(int id) {
        return new SuccessDataResult<WebPanels>(this.webPanelsDao.getById(id));
    }

    @Override
    public DataResult<List<WebPanels>> getAll() {
        return new SuccessDataResult<List<WebPanels>>(this.webPanelsDao.findAll());
    }
}
