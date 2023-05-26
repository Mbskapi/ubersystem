package com.example.uber.Dtos.Request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerRequest {
    private String id;
    private String makePayment;
    private String bookRide;
    private String pickUpLocation;
    private LocalDateTime localDateTime;
}
