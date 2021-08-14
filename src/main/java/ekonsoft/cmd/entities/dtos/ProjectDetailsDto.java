package ekonsoft.cmd.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailsDto {

    private int id;
    private String name;
    private String platforms;
    private Date deadline;
    private String tecnologies;
    private String description;
    private String info;
}
