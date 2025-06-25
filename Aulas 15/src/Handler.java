package com.example.validation;

/**
 * Interface que define o contrato para todos os manipuladores na cadeia.
 */
public interface Handler {
    /**
     * Define o próximo manipulador na cadeia.
     * @param handler O próximo manipulador.
     * @return O próprio manipulador, permitindo encadeamento de chamadas.
     */
    Handler setNext(Handler handler);

    /**
     * Lida com a requisição de validação.
     * @param login O login a ser validado.
     * @param password A senha a ser validada.
     * @return Um objeto ValidationResult indicando sucesso ou falha e a mensagem.
     */
    ValidationResult handle(String login, String password);
}