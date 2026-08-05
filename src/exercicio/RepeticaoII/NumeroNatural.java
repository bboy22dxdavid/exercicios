package exercicio.RepeticaoII;

import java.util.Scanner;

public class NumeroNatural {
    static void main() {
        //Faça um algoritmo/programa para ler um número natural N e calcular o maior número primo
        //menor do que o número N.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Numero Natural: ");
        int numNatural = scanner.nextInt();

        // Números menores ou iguais a 2 não possuem primos menores que eles
        if(numNatural <= 1){
            System.out.println("Este número " + numNatural + " não e Primo.");
        }else{
            int maiorPrimo = -1;

            // Laço externo: Começa do número imediatamente menor que N e vai descendo
            for (int i = numNatural -1; i >= 2; i--){
                boolean primo = true;
                // Laço interno: Verifica se o número atual 'i' possui divisores
                for (int j = 2; j * j <= i ; j++) {
                    if (i % j == 0){
                        primo = false; // Encontrou um divisor, então não é primo
                        break; // Sai do laço interno imediatamente
                    }
                }

                // Se passou pelo teste sem encontrar divisores, encontramos o maior primo
                if (primo) {
                    maiorPrimo = i;
                    break; // Sai do laço externo imediatamente
                }
            }

            System.out.println("O maior número primo menor do que " + numNatural + " é: " + maiorPrimo);
        }


    }
}
