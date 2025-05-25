public class FabricaPuma extends Fabrica {
    @Override
    public Produto criarProduto() {
        return new CamisaEsportiva("Botafogo", "Puma");
    }
}