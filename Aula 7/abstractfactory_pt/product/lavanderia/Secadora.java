
package abstractfactory_pt.product.lavanderia;

public class Secadora implements EletrodomesticoLavanderia {
    @Override
    public void operar() {
        System.out.println("Secadora está secando as roupas.");
    }
}
