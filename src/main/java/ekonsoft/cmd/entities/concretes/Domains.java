package ekonsoft.cmd.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "domains")
@AllArgsConstructor
@NoArgsConstructor
public class Domains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domain_id")
    private int id;

    @Column(name = "domain_registration")
    @NotNull
    private String domainRegistration;

    @ManyToOne()
    @JoinColumn(name = "project_id")
    private ProjectDetails projectDetails;
}
