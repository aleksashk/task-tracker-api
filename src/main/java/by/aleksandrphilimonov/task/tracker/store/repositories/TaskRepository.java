package by.aleksandrphilimonov.task.tracker.store.repositories;

import by.aleksandrphilimonov.task.tracker.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
