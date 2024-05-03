package com20.rest1.dto.authenticationDto;

import com20.rest1.enums.Role;
import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;

}
