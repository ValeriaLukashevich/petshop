package com.example.petshop.validation;

public enum ServiceError {

    INCORRECT_CREDENTIALS("User do not exist", "404");
//    USERNAME_TAKEN("jflsf", "222");

    private String message;

    private String errorCode;

    ServiceError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }


    public String getMessage() { return message; }


    public String getErrorCode() { return errorCode; }
}
