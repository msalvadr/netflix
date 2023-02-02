package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.ChapterDTO;
import com.netflix.netflix_project.model.entities.Chapter;
import org.mapstruct.Mapper;


@Mapper
public interface ChapterMapper {

    Chapter toEntity(ChapterDTO source);
    ChapterDTO toDto(Chapter target);


}
