package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.MailDetails;
import ekonsoft.cmd.entities.dtos.MailDetailsDto;

import java.util.List;

public interface MailDetailService {

    Result add(MailDetailsDto mailDetailsDto);
    Result delete(int id);
    Result update(MailDetailsDto mailDetailsDto, int id);
    DataResult<MailDetails> getById(int id);
    DataResult<List<MailDetails>> getAll();
    DataResult<List<MailDetails>>getByProjectDetailsId(int id);


}
