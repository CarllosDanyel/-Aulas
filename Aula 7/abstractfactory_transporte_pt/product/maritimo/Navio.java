
package abstractfactory_transporte_pt.product.maritimo;

public class Navio implements VeiculoMaritimo {
    @Override
    public void navegar() {
        System.out.println("Navio está navegando no mar.");
    }
}
