package com.example.validation;

/**
 * Manipulador que verifica se a senha NÃO possui 3 números consecutivos na sequência (Ex: Ab123).
 */
public class PasswordConsecutiveNumbersHandler extends BaseHandler {
    @Override
    public ValidationResult handle(String login, String password) {
        // Expressão regular para encontrar 3 dígitos consecutivos
        if (password.matches(".*\\d{3}.*")) {
            return new ValidationResult(false, "Erro: A senha não pode conter 3 números consecutivos.");
        }
        return checkNext(login, password);
    }
}