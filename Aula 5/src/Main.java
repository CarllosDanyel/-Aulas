import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginManager login = LoginManager.getInstancia();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (!login.verificarBot()) {
            System.out.println("Verificação de bot falhou. Acesso negado.");
            return;
        }

        if (login.autenticar(nome, senha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
    }
}
