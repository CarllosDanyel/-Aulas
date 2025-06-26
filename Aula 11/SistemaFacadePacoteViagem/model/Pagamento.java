package model;

public class Pagamento {
    private String formaPagamento;
    private int parcelas;

    public Pagamento(String formaPagamento, int parcelas) {
        this.formaPagamento = formaPagamento.toLowerCase();
        this.parcelas = parcelas;
    }

    public double calcular(double total) {
        switch (formaPagamento) {
            case "pix":
                return total * 0.9;
            case "boleto":
                return total * 0.95;
            case "crédito":
                if (parcelas > 1) {
                    double juros = 1 + 0.0399 * (parcelas - 1);
                    return total * juros;
                }
                return total;
            default:
                return total;
        }
    }

    public String getFormaPagamento() {
        return formaPagamento + (parcelas > 1 ? " em " + parcelas + "x" : "");
    }
}