package com.example.uber.Services;

import com.example.uber.Dtos.Request.ConfirmationTokenRequest;
import com.example.uber.Dtos.Response.ConfirmationTokenResponse;
import com.example.uber.Models.ConfirmationToken;
import com.example.uber.Repository.ConfirmationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ConfirmationTokenServiceImpl implements ConfirmationTokenService{
    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;

    @Override
    public void saveConfirmationToken(ConfirmationToken confirmationToken) {
      confirmationTokenRepository.save(confirmationToken);
    }

    @Override
    public Optional<ConfirmationToken> getConfirmationToken(String token) {
        return confirmationTokenRepository.findByToken(token);
    }

    @Override
    public void deleteExpiredToken() {
        confirmationTokenRepository.deleteConfirmationTokenByExpiredAtBefore(LocalDateTime.now());
    }

    @Override
    public void SetConfirmed(String token) {
        confirmationTokenRepository.confirmAt(LocalDateTime.now(), token);
    }

    @Override
    public ConfirmationToken findTokenByUserId(String id) {
        return confirmationTokenRepository.findByUserId(id);
    }
}
