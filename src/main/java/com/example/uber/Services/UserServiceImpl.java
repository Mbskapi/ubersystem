package com.example.uber.Services;

import com.example.uber.Dtos.Request.*;
import com.example.uber.Dtos.Response.LoginResponse;
import com.example.uber.Dtos.Response.RecipientDataResponse;
import com.example.uber.Dtos.Response.UserResponse;
import com.example.uber.Models.ConfirmationToken;
import com.example.uber.Models.User;
import com.example.uber.Repository.UserRepository;
import com.example.uber.email.EmailSenderService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ConfirmationTokenService confirmationTokenService;

    //private final String SECRET_KEY = System.getenv("YOUR_SECRET_KEY");

    @Autowired
    private EmailSenderService emailSenderService;


    public UserResponse createAccount(User user) throws MessagingException {
        boolean existUser = userRepository.findUserByEmailAddress(user.getEmailAddress()).isPresent();
        if(existUser) throw new IllegalStateException("email already exist, choose another email");
        User founduser = new User();

        founduser.setEmailAddress(user.getEmailAddress());
        founduser.setPassword(user.getPassword());
        founduser.setFirstName(user.getFirstName());
        founduser.setLastName(user.getLastName());
        User savedUser = userRepository.save(founduser);
        //String token = generateToken(savedUser);
        String token =new  DecimalFormat("0000").format(new SecureRandom().nextInt(9999));
        ConfirmationToken confirmationToken = new ConfirmationToken();
        confirmationToken.setToken(token);
        confirmationToken.setCreatedAt(LocalDateTime.now());
        confirmationToken.setExpiredAt(LocalDateTime.now().plusMinutes(10));
        confirmationToken.setUser(founduser);
        confirmationTokenService.saveConfirmationToken(confirmationToken);


        emailSenderService.send(savedUser.getEmailAddress(),emailSenderService.buildEmail(savedUser.getFirstName(),token));
        UserResponse userResponse = new UserResponse();
        userResponse.setMessage("created successful");
        userResponse.setStatusCode(201);
        return userResponse;
    }

    @Override
    public void enableUser(User user) {
        user.setEnable(true);
        userRepository.save(user);

    }

//    @Override
//    public UserResponse createAccount(User user) {
//        return null;
//    }

//    @Override
//    public void enableUser(String emailAddress) {
//        Optional<User> foundUser= userRepository.findUserByEmailAddress(emailAddress);
//          userRepository.save(foundUser.get());

    //}

    @Override
    public String changePassword(ChangePasswordRequest changepasswordRequest) {
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User foundUser = userRepository.findUserByEmailAddress(loginRequest.getEmailAddress())
                .orElseThrow(() -> new RuntimeException("email not found"));
        LoginResponse loginResponse = new LoginResponse();
        if(foundUser.getPassword().equals(loginRequest.getPassword())) {
            loginResponse.setMessage("successful");
            return loginResponse;
        }
        else {
            loginResponse.setMessage("re-login");
            return loginResponse;
        }
    }

//    private String generateToken(User user) {
//        StringBuilder tok = new StringBuilder();
//        SecureRandom num = new SecureRandom();
//        for (int i = 0; i<4; i++){
//            int random = num.nextInt(9);
//            tok.append(random);
//        }
//        ConfirmationToken confirmationToken = new ConfirmationToken();
//        confirmationToken.setToken(String.valueOf(tok));
//        confirmationToken.setExpiredAt(LocalDateTime.now());
//        confirmationToken.setExpiredAt(LocalDateTime.now().plusMinutes(7));
//        //confirmationToken.setUser(User);
//        confirmationTokenService.saveConfirmationToken(confirmationToken);
//        return tok.toString();
    //}




    @Override
    public UserResponse feedBack(String message) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

   //@Override
    public RecipientDataResponse initiateTransfer(RecipientDataRequest Request) throws IOException {
        return null;
   }
}