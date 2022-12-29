package com.example.petshop.validation;

import com.example.petshop.infrastructure.exception.BusinessException;
import com.example.petshop.user.User;

import java.util.Optional;

public class Validation {
    public static void validateCorrectCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(ServiceError.INCORRECT_CREDENTIALS.getMessage(), ServiceError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }
}
