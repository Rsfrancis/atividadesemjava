import java.util.Scanner;

public class Teatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] poltronas = new int[10][10];
        
        // Inicializa a matriz com -1 (poltronas vazias)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                poltronas[i][j] = -1;
            }
        }
        
        System.out.print("Digite o número de tentativas de compra: ");
        int n = scanner.nextInt();
        
        System.out.println("Digite as coordenadas das poltronas (linha e coluna):");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Tentativa " + (i + 1) + ": ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            
            // Ajusta para índices de array (0-9)
            linha--;
            coluna--;
            
            if (linha >= 0 && linha < 10 && coluna >= 0 && coluna < 10) {
                if (poltronas[linha][coluna] == -1) {
                    poltronas[linha][coluna] = 1;
                    System.out.println("Poltrona vendida com sucesso!");
                } else {
                    System.out.println("Poltrona já foi vendida");
                }
            } else {
                System.out.println("Coordenadas inválidas! Use valores entre 1 e 10.");
            }
        }
        
        System.out.println("\nMatriz final das poltronas:");
        System.out.println("(-1 = vazia, 1 = ocupada)");
        System.out.println();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(poltronas[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}