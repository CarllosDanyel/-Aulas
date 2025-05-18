
package abstractfactory_transporte_pt.product.terrestre;

public class Moto implements VeiculoTerrestre {
    @Override
    public void dirigir() {
        System.out.println("Moto está dirigindo na estrada.");
    }
}
