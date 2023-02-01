package com.netflix.netflix_project.model.mapper;


import com.netflix.netflix_project.model.dto.CategoryDTO;
import com.netflix.netflix_project.model.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryDTO> map(List<Category> categoryList);
}