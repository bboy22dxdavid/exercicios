package exercicio;
import java.util.Scanner;

public class ExVariavelPrimitiva {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite a data do seu salario: ");
        String dataSalario = scanner.nextLine();

        System.out.println("Digite seu salario: ");
        double salario = scanner.nextDouble();


        if(nome != null && nome.isEmpty()){
            System.out.println("O nome está vazio.");
        } else if (endereco != null && endereco.isEmpty()){
            System.out.println("O endereco está vazio.");
        } else if (dataSalario != null && endereco.isEmpty()) {
            System.out.println("O dataSalario está vazio.");
        } else if (salario <= 0 ) {
            System.out.println("O salario não pode ser menor que 0.");
        }else{
            String result = ("EU "+ nome+", morando no endereço:" + endereco + "," +
                    "confirmo que recebi o salario de R$: "+salario+", na data: "+dataSalario);

            System.out.println(result);
        }

    }
}
