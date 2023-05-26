package com.example.uber.Dtos.Response;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class UserResponse {
    private String message;
    private int statusCode;
    ;
}
