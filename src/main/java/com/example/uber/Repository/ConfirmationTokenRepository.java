package com.example.uber.Repository;

import com.example.uber.Models.ConfirmationToken;
import com.example.uber.Models.User;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;
@Repository
public interface ConfirmationTokenRepository extends MongoRepository<ConfirmationToken,String>{
      Optional<ConfirmationToken> findByToken(String token);
      ConfirmationToken findByUserId(String id);

      void deleteConfirmationTokenByExpiredAtBefore(LocalDateTime current);

      void confirmAt(LocalDateTime now, String confirmationToken);
}
