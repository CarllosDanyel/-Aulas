import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um time: ");
        System.out.println("1 - Brasil");
        System.out.println("2 - Flamengo");
        System.out.println("3 - Botafogo");
        System.out.println("4 - Fluminense");
        System.out.println("5 - Vasco");

        int opcao = scanner.nextInt();
        Fabrica fabrica = null;

        switch (opcao) {
            case 1:
                fabrica = new FabricaNike();
                break;
            case 2:
                fabrica = new FabricaAdidas();
                break;
            case 3:
                fabrica = new FabricaPuma();
                break;
            case 4:
                fabrica = new FabricaUmbro();
                break;
            case 5:
                fabrica = new FabricaKappa();
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        Produto produto = fabrica.criarProduto();
        produto.exibirInfo();
    }
}