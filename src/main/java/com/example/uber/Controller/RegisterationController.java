package com.example.uber.Controller;


import com.example.uber.Dtos.Request.DriverLoginRequest;
import com.example.uber.Dtos.Request.DriverRequest;
import com.example.uber.Services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("signUp")
public class RegisterationController {
    @Autowired
    private DriverService driverService;

    @PostMapping("signUp")
    public ResponseEntity<?> signUp(@RequestBody DriverRequest driverRequest){
        return new ResponseEntity<>(driverService.signUp(driverRequest), HttpStatus.CREATED);

    }
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody DriverLoginRequest driverLoginRequest){
        return new ResponseEntity<>(driverService.login(driverLoginRequest), HttpStatus.OK);
    }
    }



