
package abstractfactory_pt.client;

import abstractfactory_pt.factory.FabricaCozinha;
import abstractfactory_pt.factory.FabricaEletrodomestico;
import abstractfactory_pt.factory.FabricaLavanderia;
import abstractfactory_pt.product.cozinha.EletrodomesticoCozinha;
import abstractfactory_pt.product.lavanderia.EletrodomesticoLavanderia;

public class Cliente {
    public static void main(String[] args) {
        FabricaEletrodomestico fabricaCozinha = new FabricaCozinha();
        EletrodomesticoCozinha cozinha = fabricaCozinha.criarEletrodomesticoCozinha();
        cozinha.operar();

        FabricaEletrodomestico fabricaLavanderia = new FabricaLavanderia();
        EletrodomesticoLavanderia lavanderia = fabricaLavanderia.criarEletrodomesticoLavanderia();
        lavanderia.operar();
    }
}
