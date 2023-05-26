package com.example.uber.Dtos.Response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class LoginResponse {
    private String message;
    private int StatusCode;


}
