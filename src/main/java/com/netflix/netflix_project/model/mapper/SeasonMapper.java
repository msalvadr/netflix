package com.netflix.netflix_project.model.mapper;

import com.netflix.netflix_project.model.dto.SeasonDTO;
import com.netflix.netflix_project.model.entities.Season;
import org.mapstruct.Mapper;


@Mapper
public interface SeasonMapper {
    Season toEntity(SeasonDTO source);
    SeasonDTO toDto(Season target);
}
