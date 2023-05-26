package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class DriverLoginRequest {
    private String emailAddress;
    private String password;
}
