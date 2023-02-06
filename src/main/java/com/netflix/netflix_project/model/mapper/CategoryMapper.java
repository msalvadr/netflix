package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.dto.CategoryDTO;
import com.netflix.netflix_project.model.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper ADAPTER = Mappers.getMapper(CategoryMapper.class);

    Category toEntity(Category source);
    CategoryDTO toDto(CategoryDTO target);

    List<Category> dtoToEntities(List<ActorDTO> dtos);
    List<CategoryDTO> entitiesToDto(List<Category> entities);


}
