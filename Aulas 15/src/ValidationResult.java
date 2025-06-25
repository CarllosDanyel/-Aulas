package com.example.validation;

/**
 * Classe utilitária para encapsular o resultado de uma validação (sucesso/falha e mensagem).
 */
public class ValidationResult {
    private boolean success;
    private String message;

    public ValidationResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
               "success=" + success +
               ", message='" + message + '\'' +
               '}';
    }
}