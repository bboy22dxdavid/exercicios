package exercicio.Repeticao;

import java.util.Scanner;


public class ExWhileForIntervalos {
    static void main() {

        //Leia um número para ser testado, leia um número para início de um intervalo e outro número para o
        //fim de um intervalo. Ao Final, exiba todos os números que são divisiveis pelo número testado dentro do
        //intervalo inclusivo lido.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero para teste: ");
        int numTestado = scanner.nextInt();
        System.out.print("Digite uma numero para intervalo: ");
        int numIntervalo = scanner.nextInt();
        System.out.print("Digite uma numero para Fim intervalo: ");
        int numFimIntervalo= scanner.nextInt();

        // 2. Organizar o intervalo (menor para o maior)
        int inicio, fim;
        if (numIntervalo < numFimIntervalo) {
            inicio = numIntervalo;
            fim = numFimIntervalo;
        } else {
            inicio = numFimIntervalo;
            fim = numIntervalo;
        }

        System.out.println("==========================================");
        for (int i = numIntervalo; i <= numFimIntervalo; i++) {
            if (i % numTestado == 0);
            //System.out.println(i + " é divisível por " + divisor);
            System.out.println(i);
        }
        System.out.println("\nNúmeros divisíveis por " + numTestado + " no intervalo de " + inicio + " a " + fim + ":");
    }
}
