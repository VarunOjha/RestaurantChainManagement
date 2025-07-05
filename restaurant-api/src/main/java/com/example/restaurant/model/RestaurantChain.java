package com.example.restaurant.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "restaurants")
public class RestaurantChain {

    @Id
    private String id;
    private String name;
    private String location;

    // Getters & Setters
}