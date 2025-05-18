
package abstractfactory_transporte_pt.client;

import abstractfactory_transporte_pt.factory.FabricaVeiculo;
import abstractfactory_transporte_pt.factory.FabricaTerrestre;
import abstractfactory_transporte_pt.factory.FabricaAerea;
import abstractfactory_transporte_pt.factory.FabricaMaritima;
import abstractfactory_transporte_pt.product.terrestre.VeiculoTerrestre;
import abstractfactory_transporte_pt.product.aereo.VeiculoAereo;
import abstractfactory_transporte_pt.product.maritimo.VeiculoMaritimo;

public class Cliente {
    public static void main(String[] args) {
        FabricaVeiculo fabricaTerrestre = new FabricaTerrestre();
        VeiculoTerrestre carro = fabricaTerrestre.criarVeiculoTerrestre();
        carro.dirigir();

        FabricaVeiculo fabricaAerea = new FabricaAerea();
        VeiculoAereo helicoptero = fabricaAerea.criarVeiculoAereo();
        helicoptero.voar();

        FabricaVeiculo fabricaMaritima = new FabricaMaritima();
        VeiculoMaritimo navio = fabricaMaritima.criarVeiculoMaritimo();
        navio.navegar();
    }
}
