package exercicio.Condicao;
import java.util.Scanner;

/*
Faça um algoritmo e o respectivo programa que, dado três valores X, Y, Z, verificar se
eles podem ser um triângulo, e se forem, verificar se é um triângulo equilátero, isósceles ou
escaleno. Se eles não formarem um triângulo, escrever uma mensagem.

1 - O comprimento de cada lado de um triângulo é menor do que a soma dos
comprimentos dos outros dois lados.
2 - Chama-se triângulo equilátero o que tem os comprimentos dos três lados iguais.
3 - Chama-se triângulo isósceles o triângulo que tem os comprimento de dois lados
iguais.
* */

public class ExTriangulos {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de Z: ");
        int c = scanner.nextInt();

        // 1️⃣ Primeiro, garante que é um triângulo válido
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("É um triângulo.");
            // 2️⃣ Verifica se é Equilátero (3 lados iguais)
            if (a == b && b == c) {
                System.out.println("É um triângulo Equilátero.");
            }
            // 3️⃣ Se não for equilátero, verifica se é Isósceles (2 lados iguais)
            else if (a == b || a == c || b == c) {
                System.out.println("É um triângulo Isósceles (dois lados iguais).");
            }
            // 4️⃣ Se não for nenhum dos anteriores, só sobrou ser Escaleno
            else {
                System.out.println("É um triângulo Escaleno (todos os lados diferentes).");
            }

        } else {
            System.out.println("Essas medidas não formam um triângulo.");
        }

    }
}
