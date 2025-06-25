public class Carro {
    private String motor;
    private int portas;
    private boolean arCondicionado;
    private boolean tetoSolar;

    public Carro(String motor, int portas, boolean arCondicionado, boolean tetoSolar) {
        this.motor = motor;
        this.portas = portas;
        this.arCondicionado = arCondicionado;
        this.tetoSolar = tetoSolar;
    }

    public void exibir() {
        System.out.println("Motor: " + motor);
        System.out.println("Portas: " + portas);
        System.out.println("Ar Condicionado: " + arCondicionado);
        System.out.println("Teto Solar: " + tetoSolar);
    }
}
