
package abstractfactory_transporte_pt.factory;

import abstractfactory_transporte_pt.product.aereo.Aviao;
import abstractfactory_transporte_pt.product.aereo.VeiculoAereo;
import abstractfactory_transporte_pt.product.maritimo.VeiculoMaritimo;
import abstractfactory_transporte_pt.product.terrestre.VeiculoTerrestre;


public class FabricaAerea implements FabricaVeiculo {
    @Override
    public VeiculoTerrestre criarVeiculoTerrestre() {
        return null;
    }

    @Override
    public VeiculoAereo criarVeiculoAereo() {
        return new Aviao();
    }

    @Override
    public VeiculoMaritimo criarVeiculoMaritimo() {
        return null;
    }
}
