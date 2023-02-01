package com.netflix.netflix_project.model.repository;

import com.netflix.netflix_project.model.entities.TvShow;
import org.springframework.data.repository.CrudRepository;

public interface TvShowRepository extends CrudRepository<TvShow, Long> {
}
