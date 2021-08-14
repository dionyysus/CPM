package ekonsoft.cmd.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DomainDto {

    private int id;
    private String domainRegistration;
    private String projectDetails;
}
