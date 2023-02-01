package com.netflix.netflix_project.model.dto;


import com.netflix.netflix_project.model.entities.Actor;
import com.netflix.netflix_project.model.entities.Season;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  ChapterDTO {
    private Long id;
    private int number;
    private String name;
    private String duration;
    private Season season;
    private List<Actor> actorList;


}
