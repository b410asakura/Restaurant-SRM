package com20.rest1.api;

import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.restaurantDto.RestaurantRequest;
import com20.rest1.dto.restaurantDto.RestaurantResponse;
import com20.rest1.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/restaurant")
@PreAuthorize("hasAnyAuthority('ADMIN')")
public class RestaurantApi {

    private final RestaurantService restaurantService;

    @GetMapping
    List<RestaurantResponse> getAll(){
        return restaurantService.getAll();
    }

    @GetMapping("/")
    RestaurantResponse getById(@RequestParam Long id){
        return restaurantService.getById(id);
    }

    @PostMapping
    SimpleResponse save(@RequestBody RestaurantRequest restaurantRequest){
        return restaurantService.save(restaurantRequest);
    }

    @PutMapping("/")
    SimpleResponse update(@RequestParam Long id,
                          @RequestBody RestaurantRequest restaurantRequest){
        return restaurantService.update(id, restaurantRequest);
    }

    @DeleteMapping("/")
    SimpleResponse delete(@RequestParam Long id){
        return restaurantService.delete(id);
    }
}
