package com20.rest1.service;

import com20.rest1.dto.authenticationDto.AuthenticationResponse;
import com20.rest1.dto.authenticationDto.SignInRequest;
import com20.rest1.dto.authenticationDto.SignUpRequest;

import java.util.List;

public interface AuthenticationService {
    AuthenticationResponse signUp(SignUpRequest signUpRequest);

    AuthenticationResponse signIn(SignInRequest signInRequest);

}
