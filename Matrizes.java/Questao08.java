import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] original = new int[4][4];
        int[][] triangular = new int[4][4];

        // Preencher com valores aleatórios de 1 a 20
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                original[i][j] = rnd.nextInt(20) + 1;
                triangular[i][j] = (i < j) ? 0 : original[i][j];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", original[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz triangular inferior:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", triangular[i][j]);
            }
            System.out.println();
        }
    }
}
