package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;
import ekonsoft.cmd.entities.concretes.RelatedPersons;

import javax.xml.crypto.Data;

public interface RelatedPersonService {

    Result add(RelatedPersons relatedPersons);
    DataResult<RelatedPersons> getById(int id);
}
