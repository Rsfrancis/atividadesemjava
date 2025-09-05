import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[23];
        int[] b = new int[23];
        int[] c = new int[22]; // Vetor para resultado intercalado

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor do vetor A na posição " + i + ": ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor do vetor B na posição " + i + ": ");
            b[i] = sc.nextInt();
        }

        // Intercalar
        int k = 0;
        for (int i = 0; i < 20; i++) {
            c[k++] = a[i];
            c[k++] = b[i];
        }
        System.out.println("Vetor intercalado:");
        for (int i = 0; i < 40; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
