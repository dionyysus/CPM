package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Domains;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DomainsDao extends JpaRepository<Domains, Integer> {
    Domains getById(int id);
    List<Domains> getByProjectDetailsId(int id);

}


