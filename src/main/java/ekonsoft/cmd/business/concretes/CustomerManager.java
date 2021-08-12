package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.CustomerService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.CustomersDao;
import ekonsoft.cmd.entities.concretes.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomersDao customersDao;

    @Autowired
    public CustomerManager(CustomersDao customersDao) {
        super();
        this.customersDao = customersDao;
    }

    @Override
    public Result add(Customers customers) {
        this.customersDao.save(customers);
        return new SuccessResult("Customer added");
    }

    @Override
    public Result delete(int id) {
        this.customersDao.deleteById(id);
        return new SuccessResult("Customer deleted");
    }


    @Override
    public Result update(Customers customers) {
        this.customersDao.save(customers);
        return new SuccessResult("Customer updated");
    }

    @Override
    public DataResult<Customers> getById(int id) {
        return new SuccessDataResult<Customers>(this.customersDao.getById(id));
    }

    @Override
    public DataResult<List<Customers>> getAll() {
        return new SuccessDataResult<List<Customers>>(this.customersDao.findAll());
    }


}
