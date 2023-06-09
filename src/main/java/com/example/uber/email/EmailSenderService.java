package com.example.uber.email;

import jakarta.mail.MessagingException;
import org.springframework.scheduling.annotation.Async;


public interface EmailSenderService {
    @Async
    void send(String toEmail, String email)throws MessagingException;

    String buildEmail(String name, String link);
}



