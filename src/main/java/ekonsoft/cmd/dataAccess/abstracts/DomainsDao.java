package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Domains;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainsDao extends JpaRepository<Domains, Integer> {
    Domains getById(int id);
}

