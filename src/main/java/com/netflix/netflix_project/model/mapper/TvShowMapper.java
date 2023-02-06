package com.netflix.netflix_project.model.mapper;
import com.netflix.netflix_project.model.dto.TvShowDTO;
import com.netflix.netflix_project.model.entities.TvShow;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface TvShowMapper {

    TvShowMapper ADAPTER = Mappers.getMapper(TvShowMapper.class);

    TvShow toEntity(TvShowDTO source);
    TvShowDTO toDto(TvShow target);

    List<TvShow> dtoToEntities(List<TvShowDTO> dtos);
    List<TvShowDTO> entitiesToDto(List<TvShow> entities);
}
