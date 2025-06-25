public class CarroBuilder {
    private String motor;
    private int portas;
    private boolean arCondicionado;
    private boolean tetoSolar;

    public CarroBuilder setMotor(String motor) {
        this.motor = motor;
        return this;
    }

    public CarroBuilder setPortas(int portas) {
        this.portas = portas;
        return this;
    }

    public CarroBuilder setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
        return this;
    }

    public CarroBuilder setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
        return this;
    }

    public Carro build() {
        return new Carro(motor, portas, arCondicionado, tetoSolar);
    }
}
