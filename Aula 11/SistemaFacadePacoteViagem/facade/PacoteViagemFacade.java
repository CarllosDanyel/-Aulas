package facade;

import model.*;

public class PacoteViagemFacade {
    private Cliente[] clientes;
    private PassagemAerea passagem;
    private Hotel hotel;
    private Carro carro;
    private Pagamento pagamento;

    public PacoteViagemFacade(Cliente[] clientes, String poltrona, String tipoQuarto, String tipoCarro, String formaPagamento, int parcelas) {
        this.clientes = clientes;
        this.passagem = new PassagemAerea(poltrona);
        this.hotel = new Hotel(tipoQuarto, clientes.length);
        this.carro = new Carro(tipoCarro);
        this.pagamento = new Pagamento(formaPagamento, parcelas);
    }

    public void finalizarCompra() {
        double total = passagem.getPreco() + hotel.getPreco() + carro.getPreco();
        double totalFinal = pagamento.calcular(total);

        System.out.println("=== DADOS DA COMPRA ===");
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + ", CPF: " + c.getCpf());
        }
        System.out.println("Assento: " + passagem.getPoltrona() + " (Classe: " + passagem.getClasse() + ")");
        System.out.println("Hotel: " + hotel.getTipoQuarto());
        System.out.println("Carro: " + carro.getTipo());
        System.out.println("Forma de pagamento: " + pagamento.getFormaPagamento());
        System.out.printf("Valor total: R$ %.2f
", totalFinal);
    }
}