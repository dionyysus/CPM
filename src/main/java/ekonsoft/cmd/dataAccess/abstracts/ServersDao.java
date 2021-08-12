package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Servers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServersDao extends JpaRepository<Servers,Integer> {
    Servers getById(int id);
}
