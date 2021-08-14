package ekonsoft.cmd.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelatedPersonDto {

    private int id;
    private String name;
    private String phone;
}
