package ekonsoft.cmd.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailDetailsDto {

    private String description;
    private String address;
    private String password;
    private String serverRegistration;
    private int id;

}
