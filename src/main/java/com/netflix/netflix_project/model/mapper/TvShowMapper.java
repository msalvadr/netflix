package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.TvShowDTO;
import com.netflix.netflix_project.model.entities.TvShow;
import org.mapstruct.Mapper;


@Mapper
public interface TvShowMapper {
    TvShow toEntity(TvShowDTO source);
    TvShowDTO toDto(TvShow target);
}
