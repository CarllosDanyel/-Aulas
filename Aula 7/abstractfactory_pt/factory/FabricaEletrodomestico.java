
package abstractfactory_pt.factory;

import abstractfactory_pt.product.cozinha.EletrodomesticoCozinha;
import abstractfactory_pt.product.lavanderia.EletrodomesticoLavanderia;

public interface FabricaEletrodomestico {
    EletrodomesticoCozinha criarEletrodomesticoCozinha();
    EletrodomesticoLavanderia criarEletrodomesticoLavanderia();
}
