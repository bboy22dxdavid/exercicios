package exercicio;
import java.util.Scanner;
public class ExercicioRepeticao {
    static void main() {
        //imprima os numeros Pares

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma numero: ");
        int numero = scanner.nextInt();

        for ( numero = 0; numero <= 100 ; numero++) {
            if (numero % 2 == 0){
                System.out.println("este numer o e Par: " + numero);
            }
        }
    }
}
