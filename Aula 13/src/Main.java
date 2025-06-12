
// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ESTAÇÃO METEOROLÓGICA ===");
        System.out.println("Implementação do Padrão Observer\n");

        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        DisplayCondicoesAtuais displayAtual = new DisplayCondicoesAtuais("Display Atual");
        DisplayEstatisticas displayStats = new DisplayEstatisticas("Display Estatísticas");
        DisplayPrevisao displayPrevisao = new DisplayPrevisao("Display Previsão");

        System.out.println("--- REGISTRANDO OBSERVADORES ---");
        estacao.adicionarObservador(displayAtual);
        estacao.adicionarObservador(displayStats);
        estacao.adicionarObservador(displayPrevisao);

        System.out.println("--- PRIMEIRA MEDIÇÃO ---");
        estacao.definirMedicoes(25.5, 65.0, 1013.2);

        System.out.println("--- SEGUNDA MEDIÇÃO ---");
        estacao.definirMedicoes(27.8, 70.5, 1015.8);

        System.out.println("--- REMOVENDO OBSERVADOR ---");
        estacao.removerObservador(displayStats);

        System.out.println("--- TERCEIRA MEDIÇÃO (SEM DISPLAY ESTATÍSTICAS) ---");
        estacao.definirMedicoes(23.2, 58.3, 1010.5);

        System.out.println("--- ADICIONANDO OBSERVADOR NOVAMENTE ---");
        estacao.adicionarObservador(displayStats);

        System.out.println("--- QUARTA MEDIÇÃO (COM TODOS OS DISPLAYS) ---");
        estacao.definirMedicoes(26.1, 72.8, 1012.9);

        System.out.println("=== FIM DO PROGRAMA ===");
    }
}
