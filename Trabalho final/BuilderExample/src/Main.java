public class Main {
    public static void main(String[] args) {
        Carro carroLuxo = new CarroBuilder()
            .setMotor("2.0 Turbo")
            .setPortas(4)
            .setArCondicionado(true)
            .setTetoSolar(true)
            .build();

        carroLuxo.exibir();

        System.out.println("-----");

        Carro carroBasico = new CarroBuilder()
            .setMotor("1.0")
            .setPortas(2)
            .setArCondicionado(false)
            .setTetoSolar(false)
            .build();

        carroBasico.exibir();
    }
}
