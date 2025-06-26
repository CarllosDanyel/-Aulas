import model.CaixaAssinatura;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", "Ouro");
        CaixaAssinatura caixa = new CaixaAssinatura(cliente);
        caixa.gerarItensAleatorios();
        caixa.exibirConteudo();
    }
}