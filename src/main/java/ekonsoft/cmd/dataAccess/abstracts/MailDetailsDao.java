package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.MailDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailDetailsDao extends JpaRepository<MailDetails, Integer> {

    MailDetails getById(int id);
}
