public class Exercicio9 {
    public static void main(String[] args) {
        int[] vetor = new int;
        int n = 1;
        int i = 0;
        while (i < 100) {
            if (n % 7 != 0 && n % 10 != 7) {
                vetor[i] = n;
                i++;
            }
            n++;
        }
        System.out.println("Vetor preenchido:");
        for (i = 0; i < 100; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

