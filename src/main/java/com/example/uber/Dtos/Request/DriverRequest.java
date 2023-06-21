package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class DriverRequest {
     private String emailAddress;
     private String name;
     private String password;
     private String driverLicense;
}
