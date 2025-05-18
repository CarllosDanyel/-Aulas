
package abstractfactory_transporte_pt.factory;

import abstractfactory_transporte_pt.product.terrestre.VeiculoTerrestre;
import abstractfactory_transporte_pt.product.aereo.VeiculoAereo;
import abstractfactory_transporte_pt.product.maritimo.VeiculoMaritimo;

public interface FabricaVeiculo {
    VeiculoTerrestre criarVeiculoTerrestre();
    VeiculoAereo criarVeiculoAereo();
    VeiculoMaritimo criarVeiculoMaritimo();
}
