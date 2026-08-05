package exercicio.RepeticaoII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroInteiroPositivo {
    static void main() {
        //Fazer um algoritmo/programa que receba um número inteiro positivo N do usuário e mostre o
        //valor do seu fatorial. Se o usuário não digitar um número inteiro positivo deve ser mostrada uma
        //mensagem de erro e pedir para que ele digite novamente.

        Scanner scanner = new Scanner(System.in);

        int n = -1;
        boolean erroMensage = false;

        // Laço de repetição para garantir a entrada correta
        do {
            try {
                System.out.print("Digite um número inteiro positivo N: ");
                n = scanner.nextInt();

                // Verifica se o número atende ao critério de ser positivo (maior que zero)
                if (n <= 0) {
                    System.out.println("Erro: O número deve ser estritamente positivo (maior que 0).\n");
                } else {
                    erroMensage = true; // Força a saída do laço se o número for válido
                }
            } catch (InputMismatchException e) {
            // Trata o erro caso o usuário digite letras, pontos ou vírgulas
                System.out.println("Erro: Entrada inválida. Você deve digitar apenas números inteiros.\n");
                scanner.next(); // Limpa o buffer do scanner para evitar loop infinito
            }
        } while (!erroMensage);

        // Cálculo do Fatorial
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        // Exibe o resultado final
        System.out.println("\nO fatorial de " + n + " (" + n + "!) é: " + fatorial);
    }
}
