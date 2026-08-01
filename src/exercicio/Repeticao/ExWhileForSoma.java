package exercicio.Repeticao;

import java.util.Scanner;


public class ExWhileForSoma {
    static void main() {

        //Escreva a soma de todos os números de 1 a 10, utilizando laços de repetição. Faça um com while e um
        //com for.
        int soma = 0;
        int contador = 1;

        while (contador <= 10) {
            soma += contador;
            contador++;

            System.out.println("Soma dos numeros 1 a 10 dentro do While: " + soma);
        }
        System.out.println("==========================================");
        int soma1 = 0;
        for (int i = 1; i <= 10; i++) {
            soma1 += i;
            System.out.println("Soma dos numeros 1 a 10 dentro do For: " + soma1);
        }
    }
}
