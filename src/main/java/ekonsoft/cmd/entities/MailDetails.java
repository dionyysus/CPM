package ekonsoft.cmd.entities;

import jdk.jfr.DataAmount;
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

    private String description;
    private String address;
    private String password;
    private String serverRegistration;
}
