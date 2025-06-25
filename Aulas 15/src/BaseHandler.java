package com.example.validation;

/**
 * Classe abstrata base que implementa a lógica comum para a cadeia de responsabilidade.
 * Facilita a criação de manipuladores concretos.
 */
public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    /**
     * Método que passa a requisição para o próximo manipulador na cadeia.
     * Se não houver próximo manipulador, significa que todas as validações anteriores
     * foram bem-sucedidas.
     * @param login O login a ser validado.
     * @param password A senha a ser validada.
     * @return Um objeto ValidationResult indicando sucesso ou falha e a mensagem.
     */
    protected ValidationResult checkNext(String login, String password) {
        if (nextHandler == null) {
            return new ValidationResult(true, "Login e senha válidos.");
        }
        return nextHandler.handle(login, password);
    }
}