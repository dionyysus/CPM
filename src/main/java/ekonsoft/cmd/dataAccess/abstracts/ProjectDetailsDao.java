package ekonsoft.cmd.dataAccess.abstracts;

import ekonsoft.cmd.entities.concretes.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDetailsDao extends JpaRepository<ProjectDetails, Integer> {

    ProjectDetails getById(int id);

}
