import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Criamos uma companhia
        companhia companhia = new companhia();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar voo");
            System.out.println("2 - Listar voos");
            System.out.println("3 - Consultar voo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = teclado.nextInt();

            switch (opcao) {
            
                case 1:
                    companhia.cadastrarVoo(teclado);
                    break;
            
                case 2:
                    companhia.listarVoos();
                    break;
            
                case 3:
                    System.out.println("Consultar voo");
                    break;
            
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
            
                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
