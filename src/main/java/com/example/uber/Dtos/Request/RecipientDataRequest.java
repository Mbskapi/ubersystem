package com.example.uber.Dtos.Request;

import lombok.Data;

@Data
public class RecipientDataRequest {
    private  String bank;
    private  String accountName;
    private String accountNumber;
    private String BankCode;

}
