package ekonsoft.cmd.entities.concretes;

import com.sun.istack.NotNull;
import ekonsoft.cmd.entities.concretes.ProjectDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "web_panels")
@AllArgsConstructor
@NoArgsConstructor
public class WebPanels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "web_panel_id")
    private int id;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "web_panel_password")
    @NotNull
    private String password;

    @ManyToOne()
    @JoinColumn(name = "project_id")
    private ProjectDetails projectDetails;

}