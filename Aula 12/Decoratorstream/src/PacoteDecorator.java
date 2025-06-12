public abstract class PacoteDecorator implements Assinatura {
    protected Assinatura assinatura;

    public PacoteDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }
}