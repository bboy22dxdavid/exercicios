package exercicio.Sintaxe;
import java.util.Scanner;


public class ExercicioSucessor {
    static void main() {
        // Exercicio Leia um número e exiba seu sucessor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma Numero: ");
        int numero = scanner.nextInt();
        int sucessor =   numero++;

        //operador ternario
        String resultado =  numero<= 0 ? "Digite um numero valido! " : "O Sucesso de " + sucessor + " e: " + numero;

        System.out.println(resultado);
    }
}
