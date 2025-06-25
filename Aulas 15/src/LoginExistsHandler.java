package com.example.validation;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * Manipulador que verifica se o login está cadastrado.
 */
public class LoginExistsHandler extends BaseHandler {
    private Set<String> registeredLogins;

    public LoginExistsHandler() {
        // Logins pré-cadastrados para o exemplo
        this.registeredLogins = new HashSet<>(Arrays.asList("user123", "admin", "testuser", "joaovitor"));
    }

    @Override
    public ValidationResult handle(String login, String password) {
        if (!registeredLogins.contains(login)) {
            return new ValidationResult(false, "Erro: O login '" + login + "' não está cadastrado.");
        }
        return checkNext(login, password); // Passa para o próximo
    }
}