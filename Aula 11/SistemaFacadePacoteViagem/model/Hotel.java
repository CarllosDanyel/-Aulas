package model;

public class Hotel {
    private String tipoQuarto;
    private double preco;

    public Hotel(String tipoQuarto, int qtdPessoas) {
        this.tipoQuarto = tipoQuarto;
        switch (tipoQuarto.toLowerCase()) {
            case "executivo":
                preco = 200 * 1.5 * qtdPessoas;
                break;
            case "suíte presidencial":
                preco = 200 * 1.5 * 3 * qtdPessoas;
                break;
            default:
                preco = 200 * qtdPessoas;
        }
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public double getPreco() {
        return preco;
    }
}