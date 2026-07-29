package exercicio;
import java.util.Scanner;

public class OperadorTernario {
    static void main() {
        //operador ternario e uma forma compacta par declarar uma estrutura condicional
        //Exercico verificar se o salario e > que 5000, doar

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do Salario");
        double salario = scanner.nextDouble();
        String mensagemDoar = " Eu vou doar! ";
        String mensagemNaoDoar = " Eu Não vou doar! ";

        //condicao para operador ternario verdadeiro ou falso
        String resultado = salario > 5000f ? mensagemDoar : mensagemNaoDoar;

        System.out.println("Seu Salario e: "+ salario + resultado);


    }
}
