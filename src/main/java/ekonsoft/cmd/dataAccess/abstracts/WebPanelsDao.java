package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.WebPanels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebPanelsDao extends JpaRepository<WebPanels, Integer> {
    WebPanels getById(int id);
}
