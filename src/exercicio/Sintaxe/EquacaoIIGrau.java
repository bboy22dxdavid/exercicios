package exercicio.Sintaxe;
import java.util.Scanner;
public class EquacaoIIGrau {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do Coeficiente A: ");
        int coeficienteA = scanner.nextInt();
        System.out.print("Digite o valor do Coeficiente B: ");
        int coeficienteB = scanner.nextInt();
        System.out.print("Digite o valor do Coeficiente C: ");
        int coeficienteC = scanner.nextInt();

        int delta = (coeficienteB * coeficienteB) - (4*coeficienteA*coeficienteC);

        System.out.print("Valor de Delta : " + delta);

        if (delta >= 0) {
            double raizDestinta = (- coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
            double raizIguais = (- coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);

            if (delta == 0) {
                System.out.println("A equação possui uma raiz real única: x = " + raizDestinta);
            } else {
                System.out.println("As raízes reais são:");
                System.out.println("Primeira raiz X1: = " + raizDestinta);
                System.out.println("Segunda raiz X2: " + raizIguais);
            }
        } else {
            System.out.print("Não existe Raiz reias!");
        }
    }


}
