package com20.rest1.repository;

import com20.rest1.dto.userDto.UserResponse;
import com20.rest1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<UserResponse> getAll();

    Optional<User> getUserByEmail(String email);

    boolean existsByEmail(String email);
}
