public class PacoteFreteGratis extends PacoteDecorator {
    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Frete Grátis em produtos";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }
}