package ekonsoft.cmd.entities;


import com.sun.istack.NotNull;
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

    @Column(name = "server_name")
    @NotNull
    private String name;

    @Column(name = "server_password")
    @NotNull
    private String password;

    @Column(name = "server_address")
    @NotNull
    private String address;

    @Column(name = "server_registration")
    @NotNull
    private String registration;

    @Column(name = "server_ip")
    @NotNull
    private String ip;

    @Column(name = "server_panel_address")
    @NotNull
    private String panelAdress;

    @ManyToOne()
    @JoinColumn(name = "project_details")
    private ProjectDetails projectDetails;
}
