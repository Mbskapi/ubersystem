package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class PaymentRequest {
    private String accountName;
    private String accountNumber;
    private String bankName;

}
