public class FabricaNike extends Fabrica {
    @Override
    public Produto criarProduto() {
        return new CamisaEsportiva("Brasil", "Nike");
    }
}