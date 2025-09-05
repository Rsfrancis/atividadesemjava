import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int count = 0;

        while (count < 10) {
            System.out.print("Digite o número " + (count+1) + ": ");
            int num = sc.nextInt();
            boolean existe = false;

            for (int i = 0; i < count; i++) {
                if (vetor[i] == num) {
                    System.out.println("Número já digitado, digite outro.");
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                vetor[count] = num;
                count++;
            }
        }

        System.out.println("Vetor final com 10 números diferentes:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
