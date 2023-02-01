package com.netflix.netflix_project.model.repository;

import com.netflix.netflix_project.model.entities.Season;
import org.springframework.data.repository.CrudRepository;

public interface SeasonRepository extends CrudRepository<Season, Long> {
}
