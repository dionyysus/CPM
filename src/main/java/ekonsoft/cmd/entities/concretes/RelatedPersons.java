package ekonsoft.cmd.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "related_persons")
@AllArgsConstructor
@NoArgsConstructor
public class RelatedPersons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "related_id")
    private int id;

    @Column(name = "related_name")
    @NotNull
    private String name;

    @Column(name = "related_phone")
    @NotNull
    private String phone;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "project_id")
    private ProjectDetails projectDetails;
}
