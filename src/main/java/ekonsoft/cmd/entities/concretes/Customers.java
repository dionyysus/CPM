package ekonsoft.cmd.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "customer_name")
    @NotNull
    private String name;

    @Column(name = "customer_address")
    @NotNull
    private String address;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "project_id")
    private ProjectDetails projectDetails;

    /*@OneToMany(mappedBy = "customers")
    private List<ProjectDetails> projectDetails;*/


}
