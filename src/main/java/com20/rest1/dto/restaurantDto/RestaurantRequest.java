package com20.rest1.dto.restaurantDto;

import com20.rest1.entity.Restaurant;

public record RestaurantRequest(
        String name,
        String location,
        int numberOfEmployees,
        int service
) {
    public Restaurant requestToEntity(){
        return Restaurant.builder()
                .name(this.name)
                .location(this.location)
                .numberOfEmployees(this.numberOfEmployees)
                .service(this.service)
                .build();
    }

    public Restaurant requestToEntityForUpdate(Restaurant restaurant){
        restaurant.setName(this.name);
        restaurant.setLocation(this.location);
        restaurant.setNumberOfEmployees(this.numberOfEmployees);
        restaurant.setService(this.service);
        return restaurant;
    }
}
