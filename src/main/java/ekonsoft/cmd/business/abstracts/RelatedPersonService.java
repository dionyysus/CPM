package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.RelatedPersons;

import javax.xml.crypto.Data;
import java.util.List;

public interface RelatedPersonService {

    Result add(RelatedPersons relatedPersons);
    Result update(RelatedPersons relatedPersons);
    Result delete(int id);
    DataResult<RelatedPersons> getById(int id);
    DataResult<List<RelatedPersons>> getAll();

}
