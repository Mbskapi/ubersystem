package com.example.uber.Services;

import com.example.uber.Dtos.Request.ConfirmationTokenRequest;
import com.example.uber.Dtos.Response.ConfirmationTokenResponse;
import com.example.uber.Models.ConfirmationToken;

import java.util.Optional;

public interface ConfirmationTokenService {
   // ConfirmationTokenResponse createToken(ConfirmationTokenRequest confirmationTokenRequest);
    void saveConfirmationToken(ConfirmationToken confirmationToken);
    Optional<ConfirmationToken> getConfirmationToken(String token);
    void  deleteExpiredToken();
    void SetConfirmed(String token);
    ConfirmationToken findTokenByUserId(String id);

}
