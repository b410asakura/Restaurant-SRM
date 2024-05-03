package com20.rest1.service;

import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.restaurantDto.RestaurantRequest;
import com20.rest1.dto.restaurantDto.RestaurantResponse;

import java.util.List;

public interface RestaurantService {
    List<RestaurantResponse> getAll();

    RestaurantResponse getById(Long id);

    SimpleResponse save(RestaurantRequest restaurantRequest);

    SimpleResponse update(Long id, RestaurantRequest restaurantRequest);

    SimpleResponse delete(Long id);

}
