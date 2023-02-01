package com.netflix.netflix_project.model.repository;

import com.netflix.netflix_project.model.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActorRepository extends JpaRepository<Actor, Long> {
}
