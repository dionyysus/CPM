package ekonsoft.cmd.business.abstracts;

import ekonsoft.cmd.core.utilities.result.DataResult;
import ekonsoft.cmd.core.utilities.result.Result;

public interface MailDetailService {

    Result add(MailDetailService mailDetailService);
    DataResult<MailDetailService> getById(int id);
}
