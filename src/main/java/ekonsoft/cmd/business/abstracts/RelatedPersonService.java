package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import ekonsoft.cmd.entities.dtos.RelatedPersonDto;

import javax.xml.crypto.Data;
import java.util.List;

public interface RelatedPersonService {

    Result add(RelatedPersonDto relatedPersonDto);
    Result update(RelatedPersonDto relatedPersonDto, int id);
    Result delete(int id);
    DataResult<RelatedPersons> getById(int id);
    DataResult<List<RelatedPersons>> getAll();
    DataResult<List<RelatedPersons>>getByProjectDetailsId(int id);


}
