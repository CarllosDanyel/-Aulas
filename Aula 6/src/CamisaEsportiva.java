public class CamisaEsportiva implements Produto {
    private String time;
    private String fabricante;

    public CamisaEsportiva(String time, String fabricante) {
        this.time = time;
        this.fabricante = fabricante;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Time: " + time);
        System.out.println("Fabricante: " + fabricante);
    }
}