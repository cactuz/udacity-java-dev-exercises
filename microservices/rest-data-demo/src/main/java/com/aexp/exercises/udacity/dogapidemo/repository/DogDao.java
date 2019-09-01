package com.aexp.exercises.udacity.dogapidemo.repository;

import com.aexp.exercises.udacity.dogapidemo.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/*
This is the layer that interacts with the database. Though this is only the interface, Spring's
CrudRepository has all the boilerplate code to interact with the database.
 */
public interface DogDao extends JpaRepository<Dog, Long> {
    Dog findByNameIgnoreCase(String name);   //spring magic implementation
    List<Dog> streamAllByNameIsNotNull();
}
