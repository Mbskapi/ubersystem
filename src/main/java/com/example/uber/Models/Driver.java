package com.example.uber.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Driver {
    @Id
    private  String id;
    private  String emailAddress;
    private  String name;
    private String password;
    private  String driverLicense;
    @DBRef
    private Car  car;
}
