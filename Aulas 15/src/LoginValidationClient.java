package com.example;

import com.example.validation.*; // Importa todas as classes de validação

/**
 * Classe principal que monta a cadeia de responsabilidade e testa as validações.
 */
public class LoginValidationClient {

    public static void main(String[] args) {
        System.out.println("--- Testes de Validação de Login e Senha ---");

        // 1. Criar as instâncias dos manipuladores (as regras de validação)
        Handler loginExistsHandler = new LoginExistsHandler();
        Handler passwordMinLengthHandler = new PasswordMinLengthHandler();
        Handler passwordMaxLengthHandler = new PasswordMaxLengthHandler();
        Handler passwordUppercaseHandler = new PasswordUppercaseHandler();
        Handler passwordLowercaseHandler = new PasswordLowercaseHandler();
        Handler passwordSpecialCharHandler = new PasswordSpecialCharHandler();
        Handler passwordNumberHandler = new PasswordNumberHandler();
        Handler passwordConsecutiveNumbersHandler = new PasswordConsecutiveNumbersHandler();

        // 2. Montar a cadeia de responsabilidade
        // A ordem é importante! Se o login não existe, não faz sentido checar as regras da senha.
        loginExistsHandler
            .setNext(passwordMinLengthHandler)
            .setNext(passwordMaxLengthHandler)
            .setNext(passwordUppercaseHandler)
            .setNext(passwordLowercaseHandler)
            .setNext(passwordSpecialCharHandler)
            .setNext(passwordNumberHandler)
            .setNext(passwordConsecutiveNumbersHandler);

        // --- Exemplos de Uso ---

        // Teste 1: Login e Senha Válidos
        testValidation(loginExistsHandler, "user123", "Senha@123", "Teste 1: Login 'user123' e Senha 'Senha@123' (Válidos)");
        // Saída esperada: Login e senha válidos.

        // Teste 2: Login Não Cadastrado
        testValidation(loginExistsHandler, "usuario_novo", "Qualquer@123", "Teste 2: Login 'usuario_novo' (Login não cadastrado)");
        // Saída esperada: Erro: O login 'usuario_novo' não está cadastrado.

        // Teste 3: Senha Muito Curta
        testValidation(loginExistsHandler, "admin", "Curta1!", "Teste 3: Senha 'Curta1!' (Muito curta)");
        // Saída esperada: Erro: A senha deve ter pelo menos 8 caracteres.

        // Teste 4: Senha Muito Longa
        testValidation(loginExistsHandler, "admin", "EssaEhUmaSenhaMuitoLooooongaDemais!", "Teste 4: Senha 'EssaEhUmaSenhaMuitoLooooongaDemais!' (Muito longa)");
        // Saída esperada: Erro: A senha não pode ter mais de 16 caracteres.

        // Teste 5: Senha Sem Caractere Maiúsculo
        testValidation(loginExistsHandler, "testuser", "senhasecaracteremaiusculo@123", "Teste 5: Senha 'senhasecaracteremaiusculo@123' (Sem maiúscula)");
        // Saída esperada: Erro: A senha deve conter pelo menos um caractere maiúsculo.

        // Teste 6: Senha Sem Caractere Minúsculo
        testValidation(loginExistsHandler, "testuser", "SENHASECARACTEREMINUSCULO@123", "Teste 6: Senha 'SENHASECARACTEREMINUSCULO@123' (Sem minúscula)");
        // Saída esperada: Erro: A senha deve conter pelo menos um caractere minúsculo.

        // Teste 7: Senha Sem Caractere Especial
        testValidation(loginExistsHandler, "user123", "SenhaSemEspecial123", "Teste 7: Senha 'SenhaSemEspecial123' (Sem caractere especial)");
        // Saída esperada: Erro: A senha deve conter pelo menos um caractere especial.

        // Teste 8: Senha Sem Número
        testValidation(loginExistsHandler, "user123", "Senha@SemNumero!", "Teste 8: Senha 'Senha@SemNumero!' (Sem número)");
        // Saída esperada: Erro: A senha deve conter pelo menos um número.

        // Teste 9: Senha Com 3 Números Consecutivos
        testValidation(loginExistsHandler, "joaovitor", "MinhaSenha@123Legal", "Teste 9: Senha 'MinhaSenha@123Legal' (3 números consecutivos)");
        // Saída esperada: Erro: A senha não pode conter 3 números consecutivos.

        // Teste 10: Múltiplos Erros (A cadeia para no primeiro erro encontrado)
        testValidation(loginExistsHandler, "nao_existe", "abc", "Teste 10: Múltiplos erros (mostra o primeiro)");
        // Saída esperada: Erro: O login 'nao_existe' não está cadastrado.
    }

    /**
     * Método auxiliar para executar e imprimir o resultado de cada teste.
     */
    private static void testValidation(Handler firstHandler, String login, String password, String testName) {
        System.out.println("\n" + testName);
        ValidationResult result = firstHandler.handle(login, password);
        System.out.println("Resultado: " + result.getMessage());
    }
}