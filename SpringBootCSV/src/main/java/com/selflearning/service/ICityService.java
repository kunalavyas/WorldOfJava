package com.selflearning.service;

import com.selflearning.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
    City findById(Long id);
}
