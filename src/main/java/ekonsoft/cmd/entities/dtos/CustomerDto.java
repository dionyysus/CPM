package ekonsoft.cmd.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {


    private String name;
    private String address;
    private int projectDetailsId;

}
