package com.example.uber.Dtos.Response;

import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public class ResponseClass {
    private  HttpStatus status;
    private String statusCode;
}
