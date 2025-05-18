public class AdaptadorArmazenamentoVeiculo implements IArmazenamentoVeiculo {
    private ArmazenamentoVeiculoAntigo armazenamentoAntigo;

    public AdaptadorArmazenamentoVeiculo(ArmazenamentoVeiculoAntigo armazenamentoAntigo) {
        this.armazenamentoAntigo = armazenamentoAntigo;
    }

    @Override
    public void salvarDadosVeiculo(Veiculo veiculo) {
        String dadosLegado = "ID: " + veiculo.getId() + ", Modelo: " + veiculo.getModelo() + ", Ano: " + veiculo.getAno();
        armazenamentoAntigo.armazenarDadosVeiculo(dadosLegado);
    }
}