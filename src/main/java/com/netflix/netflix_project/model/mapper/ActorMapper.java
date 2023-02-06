package com.netflix.netflix_project.model.mapper;
import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;


@Mapper
public interface ActorMapper {

    ActorMapper ADAPTER = Mappers.getMapper(ActorMapper.class);

    Actor toEntity(ActorDTO source);
    ActorDTO toDto(Actor target);

    List<Actor> dtoToEntities(List<ActorDTO> dtos);
    List<ActorDTO> entitiesToDto(List<Actor> entities);

}
