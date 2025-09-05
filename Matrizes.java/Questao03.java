public class Ex3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenche a matriz com o produto da linha * coluna (índices começando em 1)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (i + 1) * (j + 1); // usamos i+1 e j+1 porque o enunciado considera linha/coluna a partir de 1
            }
        }

        // Imprimir a matriz
        System.out.println("Matriz 4x4 com produto linha * coluna:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
