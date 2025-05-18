import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE LOGIN ===");
        System.out.print("Usuário: ");
        String username = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        System.out.println("Prove que não é um bot. Digite: " + 
            loginSystem.getCaptchaCode());
        String captcha = scanner.nextLine();

        if (loginSystem.login(username, password, captcha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login. Tente novamente.");
        }
    }
}