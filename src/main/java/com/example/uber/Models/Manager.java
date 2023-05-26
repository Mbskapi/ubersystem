package com.example.uber.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Manager extends User {
    private  String manageDriver;
    private String maintainApp;
    private String responseToComplain;
    private String registerDriveAndVehicle;;
}
