package ekonsoft.cmd.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "mail_details")
@AllArgsConstructor
@NoArgsConstructor
public class MailDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mail_id")
    private int id;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "mail_address")
    @NotNull
    private String address;

    @Column(name = "mail_password")
    @NotNull
    private String password;

    @Column(name = "mail_server_registration")
    @NotNull
    private String serverRegistration;

    @ManyToOne()
    @JoinColumn(name = "project_id")
    private ProjectDetails projectDetails;
}
