package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersDao extends JpaRepository<Customers, Integer> {

    Customers getById(int id);
    //Customers getAll();
}
