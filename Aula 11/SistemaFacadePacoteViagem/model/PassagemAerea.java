package model;

public class PassagemAerea {
    private String poltrona;
    private String classe;
    private double preco;

    public PassagemAerea(String poltrona) {
        this.poltrona = poltrona.toUpperCase();
        int fileira = Integer.parseInt(poltrona.substring(0, poltrona.length() - 1));
        char letra = poltrona.charAt(poltrona.length() - 1);

        if (fileira >= 1 && fileira <= 3) {
            classe = "1ª Classe";
            preco = 500 * 2.5 * 1.5;
        } else if (fileira >= 4 && fileira <= 8) {
            classe = "Executiva";
            preco = 500 * 2.5;
        } else {
            classe = "Econômica";
            preco = 500;
        }
    }

    public String getPoltrona() {
        return poltrona;
    }

    public String getClasse() {
        return classe;
    }

    public double getPreco() {
        return preco;
    }
}