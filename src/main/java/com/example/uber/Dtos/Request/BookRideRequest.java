package com.example.uber.Dtos.Request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookRideRequest {
    private String customerId;
    private String emailAddress;
    private String driversInformation;
    private  String vehicleInformation;
    private String pickUpLocation;
    private  String dropOffLocation;
    private LocalDateTime timeAndDate;
}

