package com.example.restaurant.controller;

import com.example.restaurant.model.RestaurantChain;
import com.example.restaurant.repository.RestaurantChainRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/chain")
public class RestaurantChainController {

    private final RestaurantChainRepository repository;

    public RestaurantChainController(RestaurantChainRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public RestaurantChain createRestaurant(@RequestBody RestaurantChain restaurant) {
        return repository.save(restaurant);
    }

    @GetMapping
    public List<RestaurantChain> getAllRestaurantChains() {
        return repository.findAll();
    }
}