package exercicio.Sintaxe;
import java.util.Scanner;

public class CalculadoraCigarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da Carteiras de cigarro: ");
        double valorCarteira = scanner.nextDouble();

        System.out.print("Digite a QTD de carteiras fumada no dia: ");
        int qtdCarteira = scanner.nextInt();

        System.out.print("Digite a quantos anos Fuma: ");
        int anos = scanner.nextInt();

        int qtdCigarroCarteira = 20;

        if(valorCarteira <= 0 || qtdCarteira <= 0 || anos <=0 ){
            System.out.println("Digite o valor correto");
        }else {
            double totalCigarroDia = qtdCigarroCarteira * qtdCarteira;
            double totalCusto = qtdCarteira * 12 * valorCarteira * anos;


            System.out.println("O preço de uma carteira de cigarro e: R$" + valorCarteira);
            System.out.println("nº de cigarros fumados por dia " + totalCigarroDia);
            System.out.println("Valor Gasto por um fumante em " + anos + " anos" + " e R$" + totalCusto);
        }
    }
}
