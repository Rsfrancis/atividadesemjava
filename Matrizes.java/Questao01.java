import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int cont = 0;

        // leitura da matriz 4x4
        System.out.println("Digite 16 números para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Matriz[%d][%d] = ", i+1, j+1);
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > 10) {
                    cont++;
                }
            }
        }

        // impressão da matriz
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        // resultado
        System.out.println("\nQuantidade de valores maiores que 10: " + cont);

        sc.close();
    }
}
