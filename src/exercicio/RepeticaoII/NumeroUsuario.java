package exercicio.RepeticaoII;

import java.util.Scanner;

public class NumeroUsuario {
    static void main() {
        //Ler um número do usuário e determinar se ele é ou não primo.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Numero de Usuarios ");
        int usuario = scanner.nextInt();

        int divisores = 0;

        for (int i = 1; i <= usuario; i++) {
          if (usuario % i == 0){
              divisores++;

          }
        }

        // Se foi dividido exatamente 2 vezes (por 1 e por ele mesmo), é primo
        if (divisores == 2) {
            System.out.println("O número " + usuario + " é PRIMO.");
        } else {
            System.out.println("O número " + usuario + " NÃO é primo (é composto).");
        }

    }
}
