package com20.rest1.service;

import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.userDto.UserRequest;
import com20.rest1.dto.userDto.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> getAll();

    UserResponse getById(Long id);

    SimpleResponse save(UserRequest userRequest);

    SimpleResponse update(Long id, UserRequest userRequest);

    SimpleResponse delete(Long id);


}
