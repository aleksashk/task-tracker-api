package by.aleksandrphilimonov.task.tracker.api.factories;

import by.aleksandrphilimonov.task.tracker.api.dto.TaskDto;
import by.aleksandrphilimonov.task.tracker.store.entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity entity) {
        return TaskDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreatedAt())
                .description(entity.getDescription())
                .build();
    }
}
