package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.entities.TvShow;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TvShowMapper {
    List<TvShowMapper> map(List<TvShow> tvShowList);
}
