package ekonsoft.cmd.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebPanelsDto {

    private String username;
    private String password;
    private int id;

}
