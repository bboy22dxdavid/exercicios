package exercicio.Repeticao;

import java.util.Scanner;


public class ExWhileForLerNumeros {
    static void main() {

        //leia dois números e escreva todos os números, em ordem crescente, do número menor ao número
        //maior. Faça um com while e um com for.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo numero :");
        int numero2 = scanner.nextInt();

        int menor, maior;

        if (numero1 < numero2){
            menor = numero1;
            maior = numero2;
        }else {
            menor = numero2;
            maior = numero1;
        }
        System.out.println("Exibindo os números de " + menor + " até " + maior + ":");

        System.out.println("==================================================");
        int contador = menor;

        while (contador <= maior) {
            System.out.println("Contador dentro do While: " + contador);
            contador++;
        }
        System.out.println("==========================================");
        for (contador = menor; contador <= maior; contador++) {

            System.out.println("Contador dentro do For: " + contador);

        }
    }
}
