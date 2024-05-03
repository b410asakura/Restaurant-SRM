package com20.rest1.dto.restaurantDto;

import com20.rest1.entity.Restaurant;
import lombok.Builder;

@Builder
public record RestaurantResponse(
        Long id,
        String name,
        String location,
        int numberOfEmployees,
        int service
) {
    public static RestaurantResponse entityToResponse(Restaurant restaurant) {
        return RestaurantResponse.builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .location(restaurant.getLocation())
                .numberOfEmployees(restaurant.getNumberOfEmployees())
                .service(restaurant.getService())
                .build();

    }
}
