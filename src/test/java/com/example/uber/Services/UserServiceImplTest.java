package com.example.uber.Services;

import com.example.uber.Dtos.Request.LoginRequest;
import com.example.uber.Dtos.Request.UserRequest;
import com.example.uber.Dtos.Response.LoginResponse;
import com.example.uber.Dtos.Response.UserResponse;
import com.example.uber.Models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
//    @Autowired
//    UserService userService;
//    UserRequest userRequest;
//    User user;
//    @BeforeEach
//    void setUp() {
//       userRequest = new UserRequest();
//       userRequest.setEmailAddress("icesight@gmail.com");
//       userRequest.setFirstName(" mathew");
//       userRequest.setPassword("emmi2327@%&00");
//       userRequest.setLastName("okomar");
//
//       user = new User();
//       user.setLastName("kapi");
//    }
//    @Test void createUserAccount_Test(){
//        UserResponse response = userService.createAccount(user);
//        assertNotNull(response);
//        assertEquals("created successful",response.getMessage());
//
//    }
//    @Test void testThatYouCanLogin(){
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setEmailAddress("icesight@gmail.com");
//        loginRequest.setPassword("emmi2327@%&00");
//
//        LoginResponse loginResponse = userService.login(loginRequest);
//        assertNotNull(loginResponse);
//        assertEquals("successful",loginResponse.getMessage());
//
//    }

}