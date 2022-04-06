package com.adam.pizza_application.domain.exception;

public class ResorceNotFoundException extends RuntimeException{
    public ResorceNotFoundException(String message) {
        super(message);
    }
}
