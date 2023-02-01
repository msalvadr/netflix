package com.netflix.netflix_project.model.dto;


import com.netflix.netflix_project.model.entities.Chapter;
import com.netflix.netflix_project.model.entities.TvShow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeasonDTO {
    private Long id;
    private int number;
    private String name;
    private TvShow tvShow;
    private List<Chapter> chapterList;
}
