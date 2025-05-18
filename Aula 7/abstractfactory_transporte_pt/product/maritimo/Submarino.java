
package abstractfactory_transporte_pt.product.maritimo;

public class Submarino implements VeiculoMaritimo {
    @Override
    public void navegar() {
        System.out.println("Submarino está navegando debaixo d'água.");
    }
}
