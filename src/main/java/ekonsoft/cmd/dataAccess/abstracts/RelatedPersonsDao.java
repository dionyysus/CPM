package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RelatedPersonsDao extends JpaRepository<RelatedPersons, Integer> {
    RelatedPersons getById(int id);
    List<RelatedPersons> getByProjectDetailsId(int id);

}
