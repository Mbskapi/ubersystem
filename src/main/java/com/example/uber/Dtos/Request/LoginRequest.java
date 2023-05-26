package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class LoginRequest {
    private  String emailAddress;
    private String password;
}
