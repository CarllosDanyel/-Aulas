public class PacoteCashBack extends PacoteDecorator {
    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Compra com Cash Back";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 19.99;
    }
}