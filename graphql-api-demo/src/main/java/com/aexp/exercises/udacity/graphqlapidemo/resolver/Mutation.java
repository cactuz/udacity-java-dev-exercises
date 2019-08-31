package com.aexp.exercises.udacity.graphqlapidemo.resolver;

import com.aexp.exercises.udacity.graphqlapidemo.CityNotFoundException;
import com.aexp.exercises.udacity.graphqlapidemo.entity.City;
import com.aexp.exercises.udacity.graphqlapidemo.repository.CityRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Component
public class Mutation implements GraphQLMutationResolver {
    private CityRepository cityRepository;

    public Mutation(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Boolean deleteCity(String name) {
        try {
            City city = cityRepository.findCityByName(name).get();
            city.setName(name);
            cityRepository.delete(city);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public City updateCity(String name) {
        City city = cityRepository.findCityByName(name).orElseThrow( () -> new CityNotFoundException
                ("City Not Found", name));

        city.setName(name);
        cityRepository.save(city);
        return city;
    }
}
