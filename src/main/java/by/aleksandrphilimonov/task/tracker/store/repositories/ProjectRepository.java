package by.aleksandrphilimonov.task.tracker.store.repositories;

import by.aleksandrphilimonov.task.tracker.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

}
