import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[24];
        int[] v2 = new int[24];
        int[] resultado = new int[24];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite v1[" + i + "]: ");
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite v2[" + i + "]: ");
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) resultado[i] = v1[i];
            else resultado[i] = v2[i];
        }

        System.out.println("Vetor resultado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
