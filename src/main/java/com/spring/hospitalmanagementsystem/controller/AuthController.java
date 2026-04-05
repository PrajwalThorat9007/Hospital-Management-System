package com.spring.hospitalmanagementsystem.controller;

import com.spring.hospitalmanagementsystem.dto.AuthRequest;
import com.spring.hospitalmanagementsystem.dto.AuthResponse;
import com.spring.hospitalmanagementsystem.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService=authService;
    }

    @PostMapping("/register")
    public AuthResponse register(@RequestBody AuthRequest request){
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request){
        return authService.login(request);
    }
}
