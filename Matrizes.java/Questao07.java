import java.util.Scanner;

public class Ex7 {
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

        int acimaDP = 0, abaixoDP = 0, diagP = 0, diagS = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) acimaDP += matriz[i][j];
                if (i > j) abaixoDP += matriz[i][j];
                if (i == j) diagP += matriz[i][j];
                if (i + j == 2) diagS += matriz[i][j]; // DS: linha+coluna = n-1
            }
        }

        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSoma acima da DP = " + acimaDP);
        System.out.println("Soma abaixo da DP = " + abaixoDP);
        System.out.println("Soma da diagonal principal = " + diagP);
        System.out.println("Soma da diagonal secundária = " + diagS);

        sc.close();
    }
}
