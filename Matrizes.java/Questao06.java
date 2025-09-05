public class Ex6 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Preenche a matriz com base nas fórmulas
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int I = i + 1; // índices começam em 1
                int J = j + 1;
                if (I < J) {
                    matriz[i][j] = 2 * I + 7 * J - 2;
                } else if (I == J) {
                    matriz[i][j] = 3 * I * I - 1;
                } else {
                    matriz[i][j] = 4 * I * I * I - 5 * J * J + 1;
                }
            }
        }

        // Imprimir a matriz
        System.out.println("Matriz 10x10 gerada pelas fórmulas:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
