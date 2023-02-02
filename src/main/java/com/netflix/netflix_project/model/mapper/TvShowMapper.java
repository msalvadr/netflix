package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.SeasonDTO;
import com.netflix.netflix_project.model.dto.TvShowDTO;
import com.netflix.netflix_project.model.entities.Season;
import com.netflix.netflix_project.model.entities.TvShow;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TvShowMapper {
    TvShow toEntity(TvShowDTO source);
    TvShowDTO toDto(TvShow target);
}
