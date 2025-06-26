package model;

public class Cliente {
    private String nome;
    private String nivel;

    public Cliente(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel.toLowerCase();
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getLimiteItens() {
        switch (nivel) {
            case "platina": return 10;
            case "ouro": return 7;
            case "prata": return 5;
            default: return 3;
        }
    }
}