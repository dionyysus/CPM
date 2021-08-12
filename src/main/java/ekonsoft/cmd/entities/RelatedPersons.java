package ekonsoft.cmd.entities;

import com.sun.istack.NotNull;
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

    @ManyToOne()
    @JoinColumn(name = "project_details")
    private ProjectDetails projectDetails;
}
