package com.example.uber.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;
@AllArgsConstructor
@Data
public class ErrorDetails {
    private ZonedDateTime timeStamp;
    private String message;
    private String description;
}
