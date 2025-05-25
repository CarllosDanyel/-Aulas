public class FabricaKappa extends Fabrica {
    @Override
    public Produto criarProduto() {
        return new CamisaEsportiva("Vasco", "Kappa");
    }
}