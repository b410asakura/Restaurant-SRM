package com20.rest1.api;

import com20.rest1.dto.userDto.UserResponse;
import com20.rest1.service.UserService;
import jakarta.annotation.security.PermitAll;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com20.rest1.dto.SimpleResponse;
import com20.rest1.dto.userDto.UserRequest;
import com20.rest1.dto.userDto.UserResponse;
import com20.rest1.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@PreAuthorize("hasAnyAuthority('ADMIN')")
public class UserApi {

    private final UserService userService;

    @PermitAll
    @GetMapping
    List<UserResponse> getAll() {
        return userService.getAll();
    }

    @GetMapping("/")
    UserResponse getById(@RequestParam Long id) {
        return userService.getById(id);
    }

    @PostMapping
    SimpleResponse save(@RequestBody UserRequest userRequest) {
        return userService.save(userRequest);
    }

    @DeleteMapping("/")
    SimpleResponse delete(@RequestParam Long id) {
        return userService.delete(id);
    }

    @PutMapping("")
    SimpleResponse updateMap(@RequestParam Long id,
                             @RequestBody UserRequest userRequest, Principal principal) {
        System.out.println("principal.getName() = " + principal.getName());
        return userService.update(id, userRequest);
    }

}
