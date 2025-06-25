package com.example.validation;

/**
 * Manipulador que verifica se a senha possui um número.
 */
public class PasswordNumberHandler extends BaseHandler {
    @Override
    public ValidationResult handle(String login, String password) {
        if (!password.matches(".*\\d.*")) { // \\d corresponde a qualquer dígito
            return new ValidationResult(false, "Erro: A senha deve conter pelo menos um número.");
        }
        return checkNext(login, password);
    }
}