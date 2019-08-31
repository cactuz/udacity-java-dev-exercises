package com.aexp.exercises.udacity.dogapidemo.controller;

import com.aexp.exercises.udacity.dogapidemo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //This marks a class as a REST API. @RestController is a convenience annotation that combines @Controller and @ResponseBody.
public class DogController {

    @Autowired
    DogService dogService;

    @GetMapping("/dogs/breeds")
    public ResponseEntity<String> retrieveDogBreed(@RequestParam String name){
        return new ResponseEntity<>(dogService.retrieveDogBreed(name), HttpStatus.OK);
    }

    @GetMapping("/dogs/breeds/{id}")   //note cannot use request param because it would be
    // ambiguous with the first method also having param String
    public ResponseEntity<String> retrieveDogBreedById(@PathVariable Long id){
        return new ResponseEntity<>(dogService.retrieveDogBreedById(id), HttpStatus.OK);
    }

    @GetMapping("/dogs/names")
    public List<String> retrieveDogNames(){
        return dogService.retrieveDogNames();
    }
}
