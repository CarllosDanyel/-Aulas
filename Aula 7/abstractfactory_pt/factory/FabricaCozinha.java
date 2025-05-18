
package abstractfactory_pt.factory;

import abstractfactory_pt.product.cozinha.EletrodomesticoCozinha;
import abstractfactory_pt.product.cozinha.Fogao;
import abstractfactory_pt.product.lavanderia.EletrodomesticoLavanderia;

public class FabricaCozinha implements FabricaEletrodomestico {
    @Override
    public EletrodomesticoCozinha criarEletrodomesticoCozinha() {
        return new Fogao();
    }
    

    @Override
    public EletrodomesticoLavanderia criarEletrodomesticoLavanderia() {
        return null;
    }
}
