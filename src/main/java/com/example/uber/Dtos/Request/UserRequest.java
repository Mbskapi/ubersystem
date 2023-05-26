package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
}
