package SINTAXE;
import java.util.Scanner;
public class CustoConsumidor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do veiculo De fabrica: ");
        double custoFabrica  = scanner.nextDouble();
        double  porcentDistribuidor, imposto, custoFinal;
        porcentDistribuidor = (custoFabrica * 28)/100f;
        imposto = (custoFabrica * 45)/100f;
        custoFinal = custoFabrica + porcentDistribuidor + custoFabrica;

        if (custoFabrica <= 0){
            System.out.println("valor invalido");
        }else {
            System.out.println("Valor do Custo Fabrica " + porcentDistribuidor);
            System.out.println("Valor do Custo Imposto " + imposto);
            System.out.println("Custo final para o cliente " + custoFinal);
        }

    }
}
