
package abstractfactory_pt.product.lavanderia;

public class MaquinaLavar implements EletrodomesticoLavanderia {
    @Override
    public void operar() {
        System.out.println("Máquina de lavar está lavando as roupas.");
    }
}
