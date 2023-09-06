package by.aleksandrphilimonov.task.tracker.api.factories;

import by.aleksandrphilimonov.task.tracker.api.dto.ProjectDto;
import by.aleksandrphilimonov.task.tracker.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity entity) {
        return ProjectDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .createdAt(entity.getCreateAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
