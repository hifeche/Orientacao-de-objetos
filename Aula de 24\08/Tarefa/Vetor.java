import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String vetB = scanner.nextLine();
        
        System.out.println("Digite um numero de 1 a 10.");
        int vetA = scanner.nextInt();   

        System.out.println((vetB + " || ").repeat(vetA));
        scanner.close();
    }
        
}
