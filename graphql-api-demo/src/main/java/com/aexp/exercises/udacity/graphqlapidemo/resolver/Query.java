package com.aexp.exercises.udacity.graphqlapidemo.resolver;

import com.aexp.exercises.udacity.graphqlapidemo.CityNotFoundException;
import com.aexp.exercises.udacity.graphqlapidemo.entity.City;
import com.aexp.exercises.udacity.graphqlapidemo.repository.CityRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    private CityRepository cityRepository;

    public Query(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {return cityRepository.findAll();
    }

    public City findCityByName(String cityName) {
        Optional<City> optionalCity = cityRepository.findCityByName(cityName);
        return optionalCity.orElseThrow( () -> new CityNotFoundException("City Not Found", cityName));
    }


}
