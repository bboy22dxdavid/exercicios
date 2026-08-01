package exercicio.Repeticao;

import java.util.Scanner;

public class ExWhileForDecrecente {
    static void main() {
        //Escreva os números decrescentes de 60 a 10, utilizando laço de repetição. Faça um com while e um
        //com for.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int numero = scanner.nextInt();

        while (numero >= 30) {
            System.out.println("decrementando Numeros dentro do While: " +numero);
            numero--;
        }
        System.out.println("==========================================");
        for (numero = 60; numero >= 10; numero--) {
        if (numero >= 10) {
            System.out.println("decrementando Numeros no For: " + numero);
            }
        }
    }
}
