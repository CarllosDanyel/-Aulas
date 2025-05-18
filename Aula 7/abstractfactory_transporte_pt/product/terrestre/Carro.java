
package abstractfactory_transporte_pt.product.terrestre;

public class Carro implements VeiculoTerrestre {
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada.");
    }
}
