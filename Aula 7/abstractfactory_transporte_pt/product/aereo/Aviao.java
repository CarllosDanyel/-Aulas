
package abstractfactory_transporte_pt.product.aereo;

public class Aviao implements VeiculoAereo {
    @Override
    public void voar() {
        System.out.println("Avião está voando em alta altitude.");
    }
}
