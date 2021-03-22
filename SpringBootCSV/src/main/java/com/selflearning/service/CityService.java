package com.selflearning.service;

import com.selflearning.model.City;
import com.selflearning.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
        return (List<City>) repository.findAll();
    }

    @Override
    public City findById(Long id) {
        return repository.findById(id).orElse(new City());
    }
}
