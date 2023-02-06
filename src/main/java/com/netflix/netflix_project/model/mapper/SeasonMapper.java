package com.netflix.netflix_project.model.mapper;
import com.netflix.netflix_project.model.dto.SeasonDTO;
import com.netflix.netflix_project.model.entities.Season;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface SeasonMapper {

    SeasonMapper ADAPTER = Mappers.getMapper(SeasonMapper.class);

    Season toEntity(SeasonDTO source);
    SeasonDTO toDto(Season target);

    List<Season> dtoToEntities(List<SeasonDTO> dtos);
    List<SeasonDTO> entitiesToDto(List<Season> entities);
}
