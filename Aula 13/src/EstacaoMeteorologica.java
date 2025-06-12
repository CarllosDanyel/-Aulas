// EstacaoMeteorologica.java
public class EstacaoMeteorologica extends Subject {
    private double temperatura;
    private double umidade;
    private double pressao;

    public EstacaoMeteorologica() {
        super();
        temperatura = 0.0;
        umidade = 0.0;
        pressao = 0.0;
    }

    public void definirMedicoes(double temp, double umid, double press) {
        temperatura = temp;
        umidade = umid;
        pressao = press;

        String mensagem = String.format("Novas medições: Temperatura=%.1f°C, Umidade=%.1f%%, Pressão=%.1fhPa",
                temp, umid, press);

        notificarObservadores(mensagem);
    }

    public double obterTemperatura() {
        return temperatura;
    }

    public double obterUmidade() {
        return umidade;
    }

    public double obterPressao() {
        return pressao;
    }
}
