package SINTAXE;
import java.util.Scanner;



public class CalculadorQuociente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o Valor de X: ");
        int x = leitor.nextInt();
        System.out.print("Digite o Valor de y: ");
        int y = leitor.nextInt();

        if (x <= 0 && y <= 0 ){
            System.out.println("Digite um valos valido");
        } else {
            int soma = x + y;
            int quociente = y / x;
            int restodiv = y % x;

            System.out.println("A soma e: " + soma + "\n" + "o Quociente e: "
                    + quociente + "\n" + " o resto da divisão e:" + restodiv);
        }
    }
}
