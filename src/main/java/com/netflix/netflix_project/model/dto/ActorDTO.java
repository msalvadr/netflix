package com.netflix.netflix_project.model.dto;

import com.netflix.netflix_project.model.entities.Chapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorDTO {
    private Long id;
    private String name;
    private String description;
    private List<Chapter> chapterList;
}
