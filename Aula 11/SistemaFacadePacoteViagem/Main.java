import facade.PacoteViagemFacade;
import model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = {
            new Cliente("Carlos", "123.456.789-00"),
            new Cliente("Marina", "987.654.321-00")
        };

        PacoteViagemFacade pacote = new PacoteViagemFacade(
            clientes,
            "1A", // poltrona
            "Suíte Presidencial", // hotel
            "Luxo", // carro
            "crédito", // pagamento
            6 // parcelas
        );

        pacote.finalizarCompra();
    }
}