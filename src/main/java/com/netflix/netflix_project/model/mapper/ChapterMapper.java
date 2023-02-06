package com.netflix.netflix_project.model.mapper;
import com.netflix.netflix_project.model.dto.ChapterDTO;
import com.netflix.netflix_project.model.entities.Chapter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;



@Mapper
public interface ChapterMapper {

    ChapterMapper ADAPTER = Mappers.getMapper(ChapterMapper.class);

    Chapter toEntity(ChapterDTO source);
    ChapterDTO toDto(Chapter target);

    List<Chapter> dtoToEntities(List<ChapterDTO> dtos);
    List<ChapterDTO> entitiesToDto(List<Chapter> entities);


}
