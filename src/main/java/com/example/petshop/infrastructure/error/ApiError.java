package com.example.petshop.infrastructure.error;

import lombok.Data;

@Data
public class ApiError {
    private String message;
    private String errorCode;
}

