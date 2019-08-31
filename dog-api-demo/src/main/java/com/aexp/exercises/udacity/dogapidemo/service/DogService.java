package com.aexp.exercises.udacity.dogapidemo.service;

import com.aexp.exercises.udacity.dogapidemo.entity.Dog;
import com.aexp.exercises.udacity.dogapidemo.repository.DogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DogService {

    @Autowired
    private DogDao dogDao;
    private Dog emptyDog = new Dog();

    public String retrieveDogBreed(String name) {
        return dogDao.findByNameIgnoreCase(name).getBreed();
    }

    public String retrieveDogBreedById(Long id) {
            return dogDao.findById(id).orElse(emptyDog).getBreed();
        //Notice that you will not find this method in the repository (spring magic), if you try to
        // create one then it will not compile, indicating that it is conflict with the spring
        // implementation of the same name.
        //The repository also returns a java.util.Optional and that's why the handling of the
        // response is different.
    }

    public List<String> retrieveDogNames() {
        List<String> dogNames = new ArrayList<>();
        dogDao.streamAllByNameIsNotNull().forEach(dog -> dogNames.add(dog
                .getName()));
        return dogNames;
    }
}
