
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("V002", "escania", 2025);
        ArmazenamentoVeiculoAntigo armazenamentoAntigo = new ArmazenamentoVeiculoAntigo();
        IArmazenamentoVeiculo armazenamento = new AdaptadorArmazenamentoVeiculo(armazenamentoAntigo);

        armazenamento.salvarDadosVeiculo(veiculo);
    }
}
