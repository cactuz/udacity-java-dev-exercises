package com.aexp.exercises.udacity.graphqlapidemo.repository;

import com.aexp.exercises.udacity.graphqlapidemo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City,Long> {
    Optional<City> findCityByName(String city);
}
