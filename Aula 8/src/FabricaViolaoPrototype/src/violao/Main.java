package violao;

import violao.prototype.ViolaoClassico;
import violao.prototype.ViolaoDozeCordas;
import violao.prototype.ViolaoDuploZero;
import violao.prototype.ViolaoFlet;
import violao.prototype.ViolaoFolk;
import violao.prototype.ViolaoJumbo;
import violao.prototype.ViolaoPrototype;
import violao.prototype.ViolaoSeteCordas;
import violao.prototype.ViolaoTriploZero;
import violao.prototype.ViolaoZero;

public class Main {
    public static void main(String[] args) {
        ViolaoPrototype classico = new ViolaoClassico();
        ViolaoPrototype folk = new ViolaoFolk();
        ViolaoPrototype flet = new ViolaoFlet();
        ViolaoPrototype jumbo = new ViolaoJumbo();
        ViolaoPrototype seteCordas = new ViolaoSeteCordas();
        ViolaoPrototype dozeCordas = new ViolaoDozeCordas();
        ViolaoPrototype zero = new ViolaoZero();
        ViolaoPrototype duploZero = new ViolaoDuploZero();
        ViolaoPrototype triploZero = new ViolaoTriploZero();

        ViolaoPrototype cloneClassico = classico.clone();
        ViolaoPrototype cloneFolk = folk.clone();
        ViolaoPrototype cloneFlet = flet.clone();
        ViolaoPrototype cloneJumbo = jumbo.clone();
        ViolaoPrototype clone7Cordas = seteCordas.clone();
        ViolaoPrototype clone12Cordas = dozeCordas.clone();
        ViolaoPrototype cloneZero = zero.clone();
        ViolaoPrototype cloneDuploZero = duploZero.clone();
        ViolaoPrototype cloneTriploZero = triploZero.clone();

        cloneClassico.exibirInfo();
        cloneFolk.exibirInfo();
        cloneFlet.exibirInfo();
        cloneJumbo.exibirInfo();
        clone7Cordas.exibirInfo();
        clone12Cordas.exibirInfo();
        cloneZero.exibirInfo();
        cloneDuploZero.exibirInfo();
        cloneTriploZero.exibirInfo();
    }
}
