package com.example.restaurant.repository;

import com.example.restaurant.model.RestaurantChain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantChainRepository extends MongoRepository<RestaurantChain, String> {
}