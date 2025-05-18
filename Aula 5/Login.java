import java.util.Random;

public class Login {
    private static Login instancia;
    private String usuario;
    private String senha;
    private String codigoCaptcha;

    private Login() {
        gerarNovoCaptcha();
    }

    public static Login getInstancia() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }

    private void gerarNovoCaptcha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        codigoCaptcha = sb.toString();
    }

    public boolean login(String usuario, String senha, String captchaUsuario) {
        if (!captchaUsuario.equalsIgnoreCase(codigoCaptcha)) {
            gerarNovoCaptcha();
            return false;
        }
        boolean ehValido = "admin".equals(usuario) && "1234".equals(senha);
        gerarNovoCaptcha();
        return ehValido;
    }

    public String getCodigoCaptcha() {
        return codigoCaptcha;
    }
}
