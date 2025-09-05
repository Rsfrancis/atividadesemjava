import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];
        for(int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("Ordem inversa:");
        for(int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
