package com.example.uber.Dtos.Request;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Data
public class ConfirmationTokenRequest {
   @NotNull
    private String token;
   @NotNull
    private String emailAddress;
    @NotNull
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime expiredAt;
    private LocalDateTime confirmAt;
}
