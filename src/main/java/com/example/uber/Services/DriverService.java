package com.example.uber.Services;

import com.example.uber.Dtos.Request.DriverLoginRequest;
import com.example.uber.Dtos.Request.DriverRequest;
import com.example.uber.Dtos.Response.DriverLoginResponse;
import com.example.uber.Dtos.Response.DriverResponse;
import com.example.uber.Models.Driver;

public interface DriverService {
    DriverResponse signUp(DriverRequest driverRequest);

    DriverLoginResponse login(DriverLoginRequest driverLoginRequest);
    void createToken(Driver driver);
}
