package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Servers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServersDao extends JpaRepository<Servers,Integer> {
    Servers getById(int id);
    List<Servers> getByProjectDetailsId(int id);

}
