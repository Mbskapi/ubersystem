package com.example.uber.Repository;

import com.example.uber.Dtos.Request.DriverRequest;
import com.example.uber.Models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DriverRepository extends MongoRepository<Driver, String> {
    Optional<Driver> findByEmailAddress(String emailAddress);
}
