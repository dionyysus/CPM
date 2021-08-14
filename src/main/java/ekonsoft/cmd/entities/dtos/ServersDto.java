package ekonsoft.cmd.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServersDto {

    private int id;
    private String name;
    private String password;
    private String address;
    private String registration;
    private String ip;
    private String panelAdress;
}
