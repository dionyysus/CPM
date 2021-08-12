package ekonsoft.cmd.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "servers")
@AllArgsConstructor
@NoArgsConstructor
public class Servers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "server_id")
    private int id;

    private String name;
    private String password;
    private String address;
    private String registration;
    private String ip;
    private String panelAdress;
}
