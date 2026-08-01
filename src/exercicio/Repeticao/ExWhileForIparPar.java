package exercicio.Repeticao;

import java.util.Scanner;

public class ExWhileForIparPar {
    static void main() {
        //Leia dois números e escreva a quantidade de números pares e a quantidade de números ímpares,
        //contidos no intervalo inclusivo.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        int menor, maior;

        // Estrutura condicional manual para definir o intervalo
        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        int contador = menor;

        while (contador <= maior) {
            if (contador % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
            contador++;
        }
        System.out.println("\nQuantidade de números pares no While: " + qtdPares);
        System.out.println("Quantidade de números ímpares While: " + qtdImpares);


        System.out.println("===========================================");
        int impar = 0;
        int par = 0;
        int cont = menor;

        for (int i = menor; i <= maior ; i++) {
            if (cont % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("\nQuantidade de números pares no For: " + par);
        System.out.println("Quantidade de números ímpares For: " + impar);
    }
}
