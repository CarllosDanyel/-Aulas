public class PacoteCaixaSurpresa extends PacoteDecorator {
    public PacoteCaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + ", Caixa surpresa com produtos de filmes e séries";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }
}