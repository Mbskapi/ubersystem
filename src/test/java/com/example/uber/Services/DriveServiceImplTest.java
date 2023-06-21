package com.example.uber.Services;

import com.example.uber.Dtos.Request.DriverRequest;
import com.example.uber.Dtos.Response.DriverResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DriveServiceImplTest {

    @Autowired
    private DriverService driverService;


    @Test
    void testThatDriverCanSignUp() {
        DriverRequest driverRequest = new DriverRequest();
        driverRequest.setName("Egusi");
        driverRequest.setDriverLicense("dfbdsdffhgdvdf");
        driverRequest.setPassword("KapimyMan@13");
        driverRequest.setEmailAddress("emmaadsfhgjkg@gmail.com");
        DriverResponse driverResponse = driverService.signUp(driverRequest);
        assertEquals("signUp successfully", driverResponse.getMessage());
    }
}