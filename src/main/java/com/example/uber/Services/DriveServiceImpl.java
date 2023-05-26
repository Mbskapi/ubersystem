package com.example.uber.Services;

import com.example.uber.Dtos.Request.DriverLoginRequest;
import com.example.uber.Dtos.Request.DriverRequest;
import com.example.uber.Dtos.Response.DriverLoginResponse;
import com.example.uber.Dtos.Response.DriverResponse;
import com.example.uber.Models.Driver;
import com.example.uber.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriveServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public DriverResponse signUp(DriverRequest driverRequest) {
//        if (!UserValidator.isValidPassWord((driverRequest.getPassword()))) {
//            throw new RuntimeException(String.format("%s password is invalid", driverRequest.getPassword()));
//        }
//        if (!UserValidator.isValidEmail(driverRequest.getEmailAddress())) {
//            throw new RuntimeException(String.format("%s Email is invalid", driverRequest.getEmailAddress()));
        //}
        Driver driver = new Driver();
        if (driverRepository.findByEmailAddress(driverRequest.getEmailAddress()).isPresent())
            throw new RuntimeException("email exist");
        else
            driver.setEmailAddress(driverRequest.getEmailAddress());
        driver.setName(driverRequest.getName());
        driver.setDriverLicense(driverRequest.getDriverLicense());
        driver.setName(driverRequest.getName());
        driver.setPassword(driverRequest.getPassword());
        driver.setCar(driver.getCar());
        Driver savedDriver = driverRepository.save(driver);

            DriverResponse driverResponse = new DriverResponse();
            driverResponse.setMessage("signUp successfully");
            return driverResponse;
    }

    @Override
    public DriverLoginResponse login(DriverLoginRequest driverLoginRequest) {
        Driver findDriver = driverRepository.findByEmailAddress(driverLoginRequest.getEmailAddress()).
                orElseThrow(() -> new RuntimeException("email not found"));

        DriverLoginResponse driverLoginResponse = new DriverLoginResponse();
        if (findDriver.getPassword().equals(driverLoginRequest.getPassword())) {
            driverLoginResponse.setMessage("successfully");
            return driverLoginResponse;
        } else
            driverLoginResponse.setMessage("re-login");
        return driverLoginResponse;

    }

    @Override
    public void createToken(Driver driver) {

    }

}