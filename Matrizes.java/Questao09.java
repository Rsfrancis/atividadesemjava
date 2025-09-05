import java.util.*;

public class Ex9 {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros); // embaralha a lista
        Iterator<Integer> it = numeros.iterator();

        // Preenche a cartela 5x5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = it.next();
            }
        }

        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", cartela[i][j]);
            }
            System.out.println();
        }
    }
}
