package com.netflix.netflix_project.model.dto;


import com.netflix.netflix_project.model.entities.TvShow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;
    private List<TvShow> tvShows;
}
