import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Elementos pares:");
        for(int i = 0; i < vet.length; i++) {
            if(vet[i] % 2 == 0)
                System.out.println(vet[i]);
        }
    }
}
