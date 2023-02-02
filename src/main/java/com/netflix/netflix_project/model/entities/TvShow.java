package com.netflix.netflix_project.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tvshows")
public class TvShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String shortDescription;
    private String longDescription;
    private int year;
    private String recommendedAge;
    private boolean advertising;


    @ManyToOne
    private Category category;
    @OneToMany
    private List<Season> seasonList;



}
