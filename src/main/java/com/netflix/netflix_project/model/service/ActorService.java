package com.netflix.netflix_project.model.service;

import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import com.netflix.netflix_project.model.mapper.ActorMapper;
import com.netflix.netflix_project.model.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorRepository repository;

    public List<ActorDTO> listActors(){
        return ActorMapper.ADAPTER.entitiesToDto(repository.findAll());
    }

    public void saveActor(Actor actor){
        repository.save(actor);
    }

    public Actor getActorById(Long id){
        return repository.findById(id).get();
    }

    public void deleteActor(Long id){
        repository.deleteById(id);
    }
}
