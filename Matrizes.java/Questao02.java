public class Ex2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preencher a diagonal principal com 1 e o resto com 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimir a matriz
        System.out.println("Matriz 5x5 com 1 na diagonal principal e 0 no resto:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
