package ekonsoft.cmd.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "project_details")
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

    @Column(name = "project_name")
    @NotNull
    private String name;

    @Column(name = "project_platform")
    @NotNull
    private String platforms;

    @Column(name = "project_deadline")
    @NotNull
    private Date deadline;

    @Column(name = "technologies")
    @NotNull
    private String tecnologies;

    @Column(name = "project_description")
    @NotNull
    private String description;

    @Column(name = "project_info")
    @NotNull
    private String info;


    @OneToMany(mappedBy = "projectDetails")
    private List<Domains> domains;

    @OneToMany(mappedBy = "projectDetails")
    private List<MailDetails> mailDetails;

    @OneToMany(mappedBy = "projectDetails")
    private List<RelatedPersons> relatedPersons;

    @OneToMany(mappedBy = "projectDetails")
    private List<Servers> servers;

    @OneToMany(mappedBy = "projectDetails")
    private List<WebPanels> webPanels;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customers customers;
}
