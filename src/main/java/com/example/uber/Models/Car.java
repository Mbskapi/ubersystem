package com.example.uber.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private String color;
    private String make;
    private Driver driver;
    private int year;
    private int seatCapacity;
    private String plateNumber;

}

