package com.netflix.netflix_project.model.mapper;

import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ActorMapper {
    List<ActorDTO> map(List<Actor> actorList);


}
