package com.example.uber.Repository;

import com.example.uber.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findUserByEmailAddress(String emailAddress);
}
