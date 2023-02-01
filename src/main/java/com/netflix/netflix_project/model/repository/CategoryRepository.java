package com.netflix.netflix_project.model.repository;

import com.netflix.netflix_project.model.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
