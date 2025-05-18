public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("V001", "Caminhão X", 2020);
        ArmazenamentoVeiculoAntigo armazenamentoAntigo = new ArmazenamentoVeiculoAntigo();
        IArmazenamentoVeiculo armazenamento = new AdaptadorArmazenamentoVeiculo(armazenamentoAntigo);

        armazenamento.salvarDadosVeiculo(veiculo);
    }
}