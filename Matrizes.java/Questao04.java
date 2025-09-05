import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        // Leitura da matriz 4x4
        System.out.println("Digite 16 números para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Matriz[%d][%d] = ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Procurar o maior valor e sua posição
        int maior = matriz[0][0];
        int linha = 0, coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        // Imprim
