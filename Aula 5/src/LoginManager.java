import java.util.Random;
import java.util.Scanner;

public class LoginManager {
    private static LoginManager instancia;
    private Usuario usuarioSalvo;

    private LoginManager() {
        // Usuário fixo para simulação
        this.usuarioSalvo = new Usuario("admin", "1234");
    }

    public static LoginManager getInstancia() {
        if (instancia == null) {
            instancia = new LoginManager();
        }
        return instancia;
    }

    public boolean verificarBot() {
        String codigo = gerarCodigoAleatorio(6);
        System.out.println("Digite o código a seguir para continuar: " + codigo);
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        return codigo.equals(entrada);
    }

    private String gerarCodigoAleatorio(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*!";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            codigo.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return codigo.toString();
    }

    public boolean autenticar(String nome, String senha) {
        return usuarioSalvo.getNome().equals(nome) && usuarioSalvo.getSenha().equals(senha);
    }
}
