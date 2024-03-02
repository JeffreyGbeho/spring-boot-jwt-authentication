package com.app.springbootjwtauth.services;

import com.app.springbootjwtauth.dto.AuthenticationRequest;
import com.app.springbootjwtauth.dto.AuthenticationResponse;
import com.app.springbootjwtauth.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse register(RegisterRequest request) {
        return null;
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
