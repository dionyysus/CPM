package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.RelatedPersons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatedPersonsDao extends JpaRepository<RelatedPersons, Integer> {
    RelatedPersons getById(int id);
}
