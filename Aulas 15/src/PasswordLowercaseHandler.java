package com.example.validation;

/**
 * Manipulador que verifica se a senha tem um caractere em minúsculo.
 */
public class PasswordLowercaseHandler extends BaseHandler {
    @Override
    public ValidationResult handle(String login, String password) {
        if (!password.matches(".*[a-z].*")) {
            return new ValidationResult(false, "Erro: A senha deve conter pelo menos um caractere minúsculo.");
        }
        return checkNext(login, password);
    }
}