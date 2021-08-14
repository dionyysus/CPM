package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.WebPanels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WebPanelsDao extends JpaRepository<WebPanels, Integer> {
    WebPanels getById(int id);
    List<WebPanels> getByProjectDetailsId(int id);

}
