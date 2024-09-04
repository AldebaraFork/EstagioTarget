import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o texto");
        String texto = ler.nextLine();
        int contador = 0;



        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A'){
                contador++;
            }
        }
        System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + contador + " vezes na frase.");
    }
}
