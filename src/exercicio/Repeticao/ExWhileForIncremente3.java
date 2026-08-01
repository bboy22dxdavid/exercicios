package exercicio.Repeticao;

import java.util.Scanner;

public class ExWhileForIncremente3 {
    static void main() {
        //Escreva os números de 30 a 90, pulando de 3 em 3, utilizando laço de repetição. Faça um com while e
        //um com for.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int numero = scanner.nextInt();

        while (numero <= 90) {
            System.out.println("Contador no while de 3 em 3: " + numero);
            numero += 3;
        }

        System.out.println("==========================================");

        for (numero = 30; numero <= 90; numero +=3 ) {
            if (numero >= 30) {
                System.out.println("Contador no for de : 3 em 3 " + numero);
            } else {
                System.out.println("Numero não pode pular 3 casas: ");
                break;
            }
        }
    }
}
