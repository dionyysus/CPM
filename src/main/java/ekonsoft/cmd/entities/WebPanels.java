package ekonsoft.cmd.entities;

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

    private String username;
    private String password;
}
