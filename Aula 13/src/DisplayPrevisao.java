// DisplayPrevisao.java
public class DisplayPrevisao implements Observer {
    private String nome;

    public DisplayPrevisao(String nomeDisplay) {
        this.nome = nomeDisplay;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[" + nome + "] Recebeu atualização: " + mensagem);
        System.out.println("[" + nome + "] Gerando previsão do tempo...\n");
    }
}
