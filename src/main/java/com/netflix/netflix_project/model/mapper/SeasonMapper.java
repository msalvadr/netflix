package com.netflix.netflix_project.model.mapper;

import com.netflix.netflix_project.model.dto.SeasonDTO;
import com.netflix.netflix_project.model.entities.Season;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SeasonMapper {
    List<SeasonDTO> map(List<Season> seasonList);
}
