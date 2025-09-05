import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];

        for(int i = 0; i < valores.length; i++){
            System.out.print("Informe um valor: ");
            valores[i] = sc.nextInt();
        }

        System.out.println("Valores lidos:");
        for(int val : valores){
            System.out.println(val);
        }
    }
}
