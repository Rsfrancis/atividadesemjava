import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        int[] matricula = new int[n];
        double[] mediaProvas = new double[n];
        double[] mediaTrabalhos = new double[n];
        double[] notaFinal = new double[n];

        // Entrada de dados
        for (int i = 0; i < n; i++) {
            System.out.printf("Aluno %d - Matrícula: ", i + 1);
            matricula[i] = sc.nextInt();
            System.out.print("Média das provas: ");
            mediaProvas[i] = sc.nextDouble();
            System.out.print("Média dos trabalhos: ");
            mediaTrabalhos[i] = sc.nextDouble();

            notaFinal[i] = mediaProvas[i] + mediaTrabalhos[i];
        }

        // Encontrar maior nota
        int idxMaior = 0;
        for (int i = 1; i < n; i++) {
            if (notaFinal[i] > notaFinal[idxMaior]) {
                idxMaior = i;
            }
        }

        // Calcular média das notas finais
        double soma = 0;
        for (double nf : notaFinal) soma += nf;
        double mediaNF = soma / n;

        // Resultados
        System.out.println("\nNotas finais:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Aluno %d (Matrícula %d): %.2f\n",
                    i + 1, matricula[i], notaFinal[i]);
        }

        System.out.printf("\nMaior nota final: %.2f (Matrícula %d)\n",
                notaFinal[idxMaior], matricula[idxMaior]);
        System.out.printf("Média das notas finais: %.2f\n", mediaNF);

        sc.close();
    }
}
