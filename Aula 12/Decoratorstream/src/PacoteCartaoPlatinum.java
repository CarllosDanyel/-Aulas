public class PacoteCartaoPlatinum extends PacoteDecorator {
    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Cartão de Crédito Platinum";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 49.99;
    }
}