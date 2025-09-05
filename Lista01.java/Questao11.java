import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        double[] v = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        double media = soma / n;

        double variancia = 0;
        for (int i = 0; i < n; i++) {
            variancia += Math.pow(v[i] - media, 2);
        }
        variancia /= (n - 1);

        double desvioPadrao = Math.sqrt(variancia);

        System.out.println("Média = " + media);
        System.out.println("Desvio padrão = " + desvioPadrao);
    }
}