package ekonsoft.cmd.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @JoinColumn(name = "project_details")
    private ProjectDetails projectDetails;


}
