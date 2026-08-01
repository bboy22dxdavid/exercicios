package exercicio.Repeticao;

import java.util.Scanner;


public class ExWhileForCalculandoIntervalo {
    static void main() {

        //Leia um número e escreva quantos números são divididos por ele num intervalo inclusivo de 20 a 50.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int numero = scanner.nextInt();

        int divisor = 0;

        System.out.println("==========================================");
        for (int i = 20; i <= 50; i++) {
            if (i % numero == 0);
            //System.out.println(i + " é divisível por " + divisor);
            divisor++;
        }

        System.out.println("Quantidade de números entre 20 e 50 divisíveis por " + numero + ": " + divisor);
    }
}
