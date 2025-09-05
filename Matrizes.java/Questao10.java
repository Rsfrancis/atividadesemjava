import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite 9 números para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Matriz[%d][%d] = ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        int[] somaColunas = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nVetor soma das colunas:");
        for (int j = 0; j < 3; j++) {
            System.out.printf("Coluna %d = %d\n", j + 1, somaColunas[j]);
        }

        sc.close();
    }
}
