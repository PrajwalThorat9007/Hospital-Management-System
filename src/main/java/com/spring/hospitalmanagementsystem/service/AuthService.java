package com.spring.hospitalmanagementsystem.service;

import com.spring.hospitalmanagementsystem.dto.AuthRequest;
import com.spring.hospitalmanagementsystem.dto.AuthResponse;
import com.spring.hospitalmanagementsystem.entity.Role;
import com.spring.hospitalmanagementsystem.entity.User;
import com.spring.hospitalmanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public AuthResponse register(AuthRequest request){

        if(userRepository.findByEmail(request.getEmail()).isPresent()){
            return new AuthResponse("User already exists");
        }

        User user=new User(request.getName(),
                request.getEmail(),
                request.getPassword(),
                Role.ADMIN);

        userRepository.save(user);

        return new AuthResponse("User registered successfully");
    }

    public AuthResponse login(AuthRequest request){
        User user=userRepository.findByEmail(request.getEmail()).orElseThrow(()->new RuntimeException("User not found"));

        if(!user.getPassword().equals(request.getPassword())){
            throw new RuntimeException("Invalid password");
        }

        return new AuthResponse("Login successful");
    }


}
