package com.example.validation;

/**
 * Manipulador que verifica se a senha tem um caractere em maiúsculo.
 */
public class PasswordUppercaseHandler extends BaseHandler {
    @Override
    public ValidationResult handle(String login, String password) {
        if (!password.matches(".*[A-Z].*")) {
            return new ValidationResult(false, "Erro: A senha deve conter pelo menos um caractere maiúsculo.");
        }
        return checkNext(login, password);
    }
}