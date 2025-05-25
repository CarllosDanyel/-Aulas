public class FabricaAdidas extends Fabrica {
    @Override
    public Produto criarProduto() {
        return new CamisaEsportiva("Flamengo", "Adidas");
    }
}