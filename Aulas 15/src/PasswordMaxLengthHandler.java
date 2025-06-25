package com.example.validation;

/**
 * Manipulador que verifica se a senha não tem mais de 16 caracteres.
 */
public class PasswordMaxLengthHandler extends BaseHandler {
    private static final int MAX_LENGTH = 16;

    @Override
    public ValidationResult handle(String login, String password) {
        if (password.length() > MAX_LENGTH) {
            return new ValidationResult(false, "Erro: A senha não pode ter mais de " + MAX_LENGTH + " caracteres.");
        }
        return checkNext(login, password);
    }
}