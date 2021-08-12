package ekonsoft.cmd.entities;

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
    private int relatedId;

    private String relatedName;
    private String relatedPhone;
}
