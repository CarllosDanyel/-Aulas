public class Veiculo {
    private String id;
    private String modelo;
    private int ano;

    public Veiculo(String id, String modelo, int ano) {
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getId() { return id; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public void setId(String id) { this.id = id; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }
}