package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.ChapterDTO;
import com.netflix.netflix_project.model.entities.Chapter;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ChapterMapper {

    List<ChapterDTO> map(List<Chapter> chapterList);


}
