package ekonsoft.cmd.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "domains", "mailDetails", "relatedPersons", "servers", "webPanels", "customers" })
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
    private String deadline;

    @Column(name = "technologies")
    @NotNull
    private String tecnologies;

    @Column(name = "project_description")
    @NotNull
    private String description;

    @Column(name = "project_info")
    @NotNull
    private String info;

    @Column(name = "isActive")
    @NotNull
    private boolean isActive;

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

    @OneToMany(mappedBy = "projectDetails")
    private List<Customers> customers;


}
