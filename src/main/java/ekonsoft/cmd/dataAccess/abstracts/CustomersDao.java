package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomersDao extends JpaRepository<Customers, Integer> {

    Customers getById(int id);
    List<Customers> getByProjectDetailsId(int id);
    //Customers getAll();
}
