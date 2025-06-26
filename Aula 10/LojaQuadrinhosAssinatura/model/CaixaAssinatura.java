package model;

import java.util.*;

public class CaixaAssinatura {
    private Cliente cliente;
    private List<Item> itens;

    public CaixaAssinatura(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void gerarItensAleatorios() {
        Map<String, Double> catalogo = new HashMap<>();
        catalogo.put("Quadrinho", 15.00);
        catalogo.put("Chaveiro", 5.00);
        catalogo.put("Busto", 10.00);
        catalogo.put("Adesivo", 1.00);
        catalogo.put("Poster", 25.00);
        catalogo.put("Camiseta", 25.00);
        catalogo.put("Caneta", 3.00);
        catalogo.put("Miniatura", 20.00);

        List<String> nomes = new ArrayList<>(catalogo.keySet());
        Random rand = new Random();
        int limite = cliente.getLimiteItens();

        for (int i = 0; i < limite; i++) {
            String nome = nomes.get(rand.nextInt(nomes.size()));
            itens.add(new Item(nome, catalogo.get(nome)));
        }
    }

    public void exibirConteudo() {
        System.out.println("=== Caixa de Assinatura de " + cliente.getNome() + " (" + cliente.getNivel().toUpperCase() + ") ===");
        double total = 0;
        for (Item item : itens) {
            System.out.println("- " + item);
            total += item.getPreco();
        }
        System.out.printf("Valor total da caixa: R$ %.2f
", total);
    }
}