import java.util.Scanner;
import java.util.HashSet;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];

        // Ler vetores
        System.out.println("Digite 5 valores para o vetor x:");
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Digite 5 valores para o vetor y:");
        for (int i = 0; i < 5; i++) {
            y[i] = sc.nextInt();
        }

        int[] soma = new int[5];
        int[] produto = new int[5];

        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
            produto[i] = x[i] * y[i];
        }

        // Diferença (x que não estão em y)
        HashSet<Integer> setY = new HashSet<>();
        for (int val : y) setY.add(val);
        System.out.print("Diferença entre x e y: ");
        for (int val : x) {
            if (!setY.contains(val)) {
                System.out.print(val + " ");
            }
        }
        System.out.println();

        // Interseção
        System.out.print("Interseção entre x e y: ");
        for (int val : x) {
            if (setY.contains(val)) {
                System.out.print(val + " ");
            }
        }
        System.out.println();

        // União
        HashSet<Integer> uniao = new HashSet<>();
        for (int val : x) uniao.add(val);
        for (int val : y) uniao.add(val);

        System.out.print("União entre x e y: ");
        for (int val : uniao) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Mostrar soma e produto
        System.out.print("Soma elemento a elemento: ");
        for (int val : soma) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.print("Produto elemento a elemento: ");
        for (int val : produto) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
