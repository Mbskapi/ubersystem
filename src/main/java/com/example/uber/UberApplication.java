package com.example.uber;

import com.example.uber.email.EmailSenderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class UberApplication {

    private EmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(UberApplication.class, args);


//    }
//    @EventListener(ApplicationReadyEvent.class)
//        public void sendMail(){
//        senderService.sendEmail("manfil@email.com",
//                "body",
//                "this the body");
       }

}
