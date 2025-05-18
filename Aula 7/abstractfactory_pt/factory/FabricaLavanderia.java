
package abstractfactory_pt.factory;

import abstractfactory_pt.product.cozinha.EletrodomesticoCozinha;
import abstractfactory_pt.product.lavanderia.EletrodomesticoLavanderia;
import abstractfactory_pt.product.lavanderia.Secadora;

public class FabricaLavanderia implements FabricaEletrodomestico {
    @Override
    public EletrodomesticoCozinha criarEletrodomesticoCozinha() {
        return null;
    }

    @Override
    public EletrodomesticoLavanderia criarEletrodomesticoLavanderia() {
        return new Secadora();
    }
}
