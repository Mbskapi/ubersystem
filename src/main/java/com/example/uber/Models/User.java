package com.example.uber.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document
@Data
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private Manager manager;
    private Customer customer;
    private boolean isEnable;
    @DBRef
    private List<PaymentType> useCard = new ArrayList<>();

}
