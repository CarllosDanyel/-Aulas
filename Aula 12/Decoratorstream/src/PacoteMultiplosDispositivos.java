public class PacoteMultiplosDispositivos extends PacoteDecorator {
    public PacoteMultiplosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Multiplos Dispositivos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}