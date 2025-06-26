package model;

public class Carro {
    private String tipo;
    private double preco;

    public Carro(String tipo) {
        this.tipo = tipo;
        switch (tipo.toLowerCase()) {
            case "executivo":
                preco = 150 * 2;
                break;
            case "luxo":
                preco = 150 * 4;
                break;
            default:
                preco = 150;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}