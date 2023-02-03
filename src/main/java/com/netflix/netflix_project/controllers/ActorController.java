package com.netflix.netflix_project.controllers;

import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import com.netflix.netflix_project.model.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ActorController {

    @Autowired
    private ActorService service;

    @GetMapping(value = "/actors")
    public ResponseEntity<List<ActorDTO>> listActors(){
        List<ActorDTO> actorDTOList = service.listActors();
        return ResponseEntity.ok().body(actorDTOList);
    }
}
