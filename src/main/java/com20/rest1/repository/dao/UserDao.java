package com20.rest1.repository.dao;

import com20.rest1.dto.authenticationDto.UserResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserResponse> getAll();
}
