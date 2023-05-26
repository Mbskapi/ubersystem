package com.example.uber.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
@NoArgsConstructor
public class RecipientData {
    private String account_number;
    private String  bank_id;
    private String account_name;
    private String bankCode;
}
