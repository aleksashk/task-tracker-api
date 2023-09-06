package by.aleksandrphilimonov.task.tracker.store.entities;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "task_state")
public class TaskStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    private Long ordinal;

    private Instant createdAt = Instant.now();

    @OneToMany
    private List<ProjectEntity> tasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Long ordinal) {
        this.ordinal = ordinal;
    }

    public List<ProjectEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<ProjectEntity> tasks) {
        this.tasks = tasks;
    }
}
