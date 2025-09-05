import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        for(int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Elementos ímpares:");
        for(int n : numeros) {
            if(n % 2 != 0)
                System.out.println(n);
        }
        System.out.println("Elementos das posições pares:");
        for(int i = 0; i < 20; i += 2) {
            System.out.println(numeros[i]);
        }
    }
}
