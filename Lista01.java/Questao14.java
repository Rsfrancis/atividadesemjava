import java.util.Scanner;

public class ControleFaltas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de alunos: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        
        String[] nomes = new String[n];
        int[][] faltas = new int[n][30]; // 0 = presente, 1 = falta
        int[] totalFaltas = new int[n];
        
        // Ler os dados dos alunos
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            
            System.out.println("Digite as presenças do aluno " + nomes[i] + " (F para falta, P para presente):");
            for (int j = 0; j < 30; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                String presenca = scanner.nextLine().toUpperCase();
                
                if (presenca.equals("F")) {
                    faltas[i][j] = 1;
                    totalFaltas[i]++;
                } else {
                    faltas[i][j] = 0;
                }
            }
        }
        
        System.out.println("\nAlunos reprovados por falta:");
        
        for (int i = 0; i < n; i++) {
            if (totalFaltas[i] > 10) {
                System.out.print(nomes[i] + " - dias: ");
                for (int j = 0; j < 30; j++) {
                    if (faltas[i][j] == 1) {
                        System.out.print((j + 1) + " ");
                    }
                }
                System.out.println();
            }
        }
        
        scanner.close(); 
    }
    
}