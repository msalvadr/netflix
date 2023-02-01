package com.netflix.netflix_project.model.dto;


import com.netflix.netflix_project.model.entities.Category;
import com.netflix.netflix_project.model.entities.Season;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvShowDTO {

    private Long id;

    private String name;
    private String shortDescription;
    private String longDescription;
    private int year;
    private String recommendedAge;
    private boolean advertising;



    private Category category;

    private List<Season> seasonList;

}
