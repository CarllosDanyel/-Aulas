public class Main {
    public static void main(String[] args) {
        Assinatura minhaAssinatura = new AssinaturaBase();
        minhaAssinatura = new PacoteMultiplosDispositivos(minhaAssinatura);
        minhaAssinatura = new PacoteFreteGratis(minhaAssinatura);
        minhaAssinatura = new PacoteCaixaSurpresa(minhaAssinatura);

        System.out.println("Descrição: " + minhaAssinatura.getDescricao());
        System.out.printf("Preço total: R$ %.2f%n", minhaAssinatura.getPreco());
    }
}