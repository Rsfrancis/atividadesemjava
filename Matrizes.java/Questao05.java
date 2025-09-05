import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        // Leitura da matriz 5x5
        System.out.println("Digite 25 números para preencher a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Matriz[%d][%d] = ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        // Ler valor a ser buscado
        System.out
