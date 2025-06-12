// DisplayCondicoesAtuais.java
public class DisplayCondicoesAtuais implements Observer {
    private String nome;

    public DisplayCondicoesAtuais(String nomeDisplay) {
        this.nome = nomeDisplay;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[" + nome + "] Recebeu atualização: " + mensagem);
        System.out.println("[" + nome + "] Exibindo condições meteorológicas atuais...\n");
    }
}
