package ekonsoft.cmd.entities.dtos;


import ekonsoft.cmd.entities.concretes.Customers;
import ekonsoft.cmd.entities.concretes.Domains;
import ekonsoft.cmd.entities.concretes.MailDetails;
import ekonsoft.cmd.entities.concretes.RelatedPersons;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsDto {

    private String name;
    private String platforms;
    private String deadline;
    private String tecnologies;
    private String description;
    private String info;
    private boolean isActive;


}
