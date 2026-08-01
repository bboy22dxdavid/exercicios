package exercicio.Repeticao;

import java.util.Scanner;

public class ExWhileForIpar {
    static void main() {
        //Escreva todos os números ímpares de 100 a 200. Faça um com while e um com for.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int contador = scanner.nextInt();

        while (contador <= 200) {
            // Se o resto da divisão por 2 for diferente de zero, é ímpar
            if (contador % 2 != 0) {
                System.out.println("Contador no WHILE de Numeros Impar: " + contador);
            }
            contador++; // O incremento fica fora do if para rodar em todos os números
        }

        System.out.println("==========================================");

        for (contador = 100; contador <= 200; contador++) {
            if (contador % 2 != 0) {
                System.out.println("Contador no For de Numeros Ipar " + contador);
            }
        }
    }
}
