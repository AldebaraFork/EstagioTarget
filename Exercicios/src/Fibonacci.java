import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int numero;


        System.out.println("Digite o numero");
        numero = ler.nextInt();

        for (int i = 2; i < numero; ++i) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;

        }

    }
}