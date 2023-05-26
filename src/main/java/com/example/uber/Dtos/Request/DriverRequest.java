package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class DriverRequest {
     private String EmailAddress;
     private  String Name;
     private String Password;
     private String DriverLicense;
}
