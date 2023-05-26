package com.example.uber.Controller;

import com.example.uber.Dtos.Request.*;
//import com.example.uber.Services.RecipientDataService;
import com.example.uber.Models.User;
import com.example.uber.Services.UserService;
import com.example.uber.utils.ApiResponse;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path ="/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    // private RecipientDataService recipientDataService;


    @PostMapping("/createAccount")
    public ResponseEntity<?> createAccount(@RequestBody User user) throws MessagingException {
        return new ResponseEntity<>(userService.createAccount(user), HttpStatus.CREATED);


    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>(userService.login(loginRequest), HttpStatus.OK);

    }

    @PostMapping("changePassword")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        return new ResponseEntity<>(userService.changePassword(changePasswordRequest), HttpStatus.OK);

    }

//    @PostMapping("generateToken")
//    public ResponseEntity<?> generateToken(@RequestBody User confirmationTokenRequest) {
//        return new ResponseEntity<>(userService.generateToken(confirmationTokenRequest), HttpStatus.OK);
//
//    }
}