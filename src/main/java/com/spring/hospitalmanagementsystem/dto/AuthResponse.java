package com.spring.hospitalmanagementsystem.dto;

public class AuthResponse {

    private String token;
    private String message;

    public AuthResponse() {}

    public AuthResponse(String message,String token) {
        this.token=token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
        return message;
    }
}
