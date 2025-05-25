public class FabricaUmbro extends Fabrica {
    @Override
    public Produto criarProduto() {
        return new CamisaEsportiva("Fluminense", "Umbro");
    }
}