package com.example.validation;

/**
 * Manipulador que verifica se a senha possui Pelo menos um caractere especial.
 */
public class PasswordSpecialCharHandler extends BaseHandler {
    @Override
    public ValidationResult handle(String login, String password) {
        // Expressão regular para verificar a presença de caracteres especiais comuns
        if (!password.matches(".*[!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\-].*")) {
            return new ValidationResult(false, "Erro: A senha deve conter pelo menos um caractere especial (@, #, $, %, &, etc.).");
        }
        return checkNext(login, password);
    }
}