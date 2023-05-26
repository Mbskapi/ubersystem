package com.example.uber.Services;

import com.example.uber.Dtos.Request.*;
import com.example.uber.Dtos.Response.LoginResponse;
import com.example.uber.Dtos.Response.UserResponse;
import com.example.uber.Models.User;
import jakarta.mail.MessagingException;

public interface UserService {
    UserResponse createAccount(User user) throws MessagingException;

    void  enableUser(User user);

    String changePassword(ChangePasswordRequest changepasswordRequest);

    LoginResponse login(LoginRequest loginRequest);

    //String generateToken (User user);

    UserResponse feedBack(String message);
    void saveUser(User user);



    //RecipientDataResponse initiateTransfer(RecipientDataRequest Request) throws IOException;
}


//}
