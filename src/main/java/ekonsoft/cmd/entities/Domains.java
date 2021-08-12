package ekonsoft.cmd.entities;

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
    private int domainId;

    private String domainRegistration;
}
