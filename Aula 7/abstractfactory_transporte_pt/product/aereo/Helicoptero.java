
package abstractfactory_transporte_pt.product.aereo;

public class Helicoptero implements VeiculoAereo {
    @Override
    public void voar() {
        System.out.println("Helicóptero está voando no céu.");
    }
}
