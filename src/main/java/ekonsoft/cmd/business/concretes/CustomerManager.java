package ekonsoft.cmd.business.concretes;

import ekonsoft.cmd.business.abstracts.CustomerService;
import ekonsoft.cmd.business.abstracts.ProjectDetailService;
import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.core.utilities.result.SuccessDataResult;
import ekonsoft.cmd.core.utilities.result.SuccessResult;
import ekonsoft.cmd.dataAccess.abstracts.CustomersDao;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.dtos.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomersDao customersDao;
    private ProjectDetailService projectDetailService;

    @Autowired
    public CustomerManager(CustomersDao customersDao, ProjectDetailService projectDetailService) {
        this.customersDao = customersDao;
        this.projectDetailService = projectDetailService;
    }

    @Override
    public Result add(CustomerDto customerDto) {

        Customers customers = new Customers();
        customers.setProjectDetails(projectDetailService.getById(customerDto.getProjectDetailsId()).getData());
        customers.setName(customerDto.getName());
        customers.setAddress(customerDto.getAddress());

        this.customersDao.save(customers);
        return new SuccessResult("Customer added");
    }

    @Override
    public Result delete(int id) {
        this.customersDao.deleteById(id);
        return new SuccessResult("Customer deleted");
    }


    @Override
    public Result update(CustomerDto customerDto, int id) {

        Customers customers = customersDao.getById(id);

        customers.setAddress(customerDto.getAddress());
        customers.setName(customerDto.getName());

        customersDao.save(customers);
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

    @Override
    public DataResult<List<Customers>> getByProjectDetailsId(int id) {
        return new SuccessDataResult<List<Customers>>(this.customersDao.getByProjectDetailsId(id));
    }


}
