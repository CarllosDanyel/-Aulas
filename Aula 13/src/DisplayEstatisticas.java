// DisplayEstatisticas.java
public class DisplayEstatisticas implements Observer {
    private String nome;
    private int totalAtualizacoes;

    public DisplayEstatisticas(String nomeDisplay) {
        this.nome = nomeDisplay;
        this.totalAtualizacoes = 0;
    }

    @Override
    public void atualizar(String mensagem) {
        totalAtualizacoes++;
        System.out.println("[" + nome + "] Recebeu atualização #" + totalAtualizacoes + ": " + mensagem);
        System.out.println("[" + nome + "] Calculando estatísticas meteorológicas...\n");
    }
}
