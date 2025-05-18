
package abstractfactory_pt.product.cozinha;

public class Fogao implements EletrodomesticoCozinha {
    @Override
    public void operar() {
        System.out.println("Fogão está esquentando os alimentos.");
    }
}
