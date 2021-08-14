package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.MailDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MailDetailsDao extends JpaRepository<MailDetails, Integer> {

    MailDetails getById(int id);
    List<MailDetails> getByProjectDetailsId(int id);

}
