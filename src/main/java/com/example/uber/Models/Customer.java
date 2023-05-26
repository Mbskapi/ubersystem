package com.example.uber.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
@Data
public class Customer extends User{
    private String makePayment;
    private String bookRide;
    private String pickUpLocation;
    private LocalDateTime localDateTime;
}
