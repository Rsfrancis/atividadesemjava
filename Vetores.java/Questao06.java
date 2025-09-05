import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[23]; // Vetor para guardar nomes
        int[] idades = new int[23];      // Vetor para guardar idades
        int soma = 0; // Para somar todas as idades

        // Ler nomes
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }
        // Ler idades
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
            soma += idades[i]; // Soma cada idade
        }

        double media = soma / 20.0;
        System.out.println("Idade média: " + media);

        System.out.println("Pessoas com idade acima da média:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
