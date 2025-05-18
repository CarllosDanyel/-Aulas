
package abstractfactory_pt.product.cozinha;

public class Geladeira implements EletrodomesticoCozinha {
    @Override
    public void operar() {
        System.out.println("Geladeira está refrigerando os alimentos.");
    }
}
