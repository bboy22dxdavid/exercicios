package exercicio.Repeticao;

import java.util.Scanner;


public class ExWhileFor {
    static void main() {

        //1) Escreva os números de 10 a 100, utilizando laço de repetição. Faça um com while e um com for.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int numero = scanner.nextInt();

        while (numero <= 100) {
            System.out.println("Numeros dentro do While: " +numero);
            numero++;
        }
        System.out.println("==========================================");
        for (numero = 0; numero <= 100; numero++) {
        if (numero >= 10) {
            System.out.println("Numeros no For: " + numero);
            }
        }
    }
}
