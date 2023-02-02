package com.netflix.netflix_project.model.mapper;
import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import org.mapstruct.Mapper;


@Mapper
public interface ActorMapper {
    Actor toEntity(ActorDTO source);
    ActorDTO toDto(Actor target);
}
