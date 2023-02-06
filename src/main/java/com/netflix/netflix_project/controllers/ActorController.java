package com.netflix.netflix_project.controllers;

import com.netflix.netflix_project.model.dto.ActorDTO;
import com.netflix.netflix_project.model.entities.Actor;
import com.netflix.netflix_project.model.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService service;

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<List<ActorDTO>> listActors(){
        List<ActorDTO> actorDTOList = service.listActors();
        return ResponseEntity.ok().body(actorDTOList);
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        service.deleteActor(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
