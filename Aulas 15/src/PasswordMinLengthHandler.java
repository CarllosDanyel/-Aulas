package com.example.validation;

/**
 * Manipulador que verifica se a senha tem pelo menos 8 caracteres.
 */
public class PasswordMinLengthHandler extends BaseHandler {
    private static final int MIN_LENGTH = 8;

    @Override
    public ValidationResult handle(String login, String password) {
        if (password.length() < MIN_LENGTH) {
            return new ValidationResult(false, "Erro: A senha deve ter pelo menos " + MIN_LENGTH + " caracteres.");
        }
        return checkNext(login, password);
    }
}