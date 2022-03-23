package com.adam.pizza_application.domain.service;

import com.adam.pizza_application.domain.exception.UnauthorizedException;

public class AuthorizationService {
    public static void checkToken(String token) {
        if (token == null || !token.equals("xzv")) {
            throw new UnauthorizedException("Błędny token");
        }
    }
}
