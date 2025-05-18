
package abstractfactory_transporte_pt.factory;

import abstractfactory_transporte_pt.product.aereo.VeiculoAereo;
import abstractfactory_transporte_pt.product.maritimo.VeiculoMaritimo;
import abstractfactory_transporte_pt.product.terrestre.Moto;
import abstractfactory_transporte_pt.product.terrestre.VeiculoTerrestre;

public class FabricaTerrestre implements FabricaVeiculo {
    @Override
    public VeiculoTerrestre criarVeiculoTerrestre() {
        return new Moto();
    }

    @Override
    public VeiculoAereo criarVeiculoAereo() {
        return null;
    }

    @Override
    public VeiculoMaritimo criarVeiculoMaritimo() {
        return null;
    }
}
