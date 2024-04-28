package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food> findAll();

    Food findById(int theId);

    Food save(Food theEmployee);

    void deleteById(int theId);
}
